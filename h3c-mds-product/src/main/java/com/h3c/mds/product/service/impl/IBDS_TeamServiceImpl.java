package com.h3c.mds.product.service.impl;

import java.util.List;
import java.util.Map;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.h3c.mds.product.common.ProductConst;
import com.h3c.mds.product.dao.IBDS_TeamMapper;
import com.h3c.mds.product.dao.TeamViewMapper;
import com.h3c.mds.product.entity.IBDS_Team;
import com.h3c.mds.product.entity.IBDS_TeamExample;
import com.h3c.mds.product.entity.IBDS_TeamExample.Criteria;
import com.h3c.mds.product.entity.TeamView;
import com.h3c.mds.product.service.IBDS_TeamService;

@Service
public class IBDS_TeamServiceImpl implements IBDS_TeamService {

	private static final Logger LOG = LoggerFactory.getLogger(IBDS_TeamServiceImpl.class);
	@Autowired
	private IBDS_TeamMapper ibdsTeamMapper;

	@Autowired
	private TeamViewMapper teamViewMapper;

	@Override
	@Transactional(readOnly = true)
	public List<TeamView> getTreeData(Map<String, String> param) {
		List<TeamView> teamTreeData = null;
		try {
			teamTreeData = teamViewMapper.getTreeData(param);
		} catch (Exception e) {
			e.printStackTrace();
			LOG.error("查询数据库出错" + param);
		}
		return teamTreeData;
	}

	@Override
	@Transactional(readOnly = true)
	public TeamView selectByCode(String code) {
		return teamViewMapper.selectByCode(code);
	}

	@Override
	@Transactional
	public int addIBDSTeam(IBDS_Team team) {
		return ibdsTeamMapper.insertSelective(team);
	}

	@Override
	@Transactional
	public int editIBDSTeam(IBDS_Team team) {
		team.setId(null);
		IBDS_TeamExample example = new IBDS_TeamExample();
		Criteria criteria = example.createCriteria();
		criteria.andTeamnoEqualTo(team.getTeamno());
		IBDS_Team oldTeam = getTeamByCode(team.getTeamno());

		// 处理曾用名
		if (oldTeam != null && team.getTeam() != null && !team.getTeam().equals(oldTeam.getTeam())) {
			if (StringUtils.isNotBlank(oldTeam.getTeamold())) {
				team.setTeamold(oldTeam.getTeamold() + ";" + oldTeam.getTeam());
			} else {
				team.setTeamold(oldTeam.getTeam());
			}
		}
		return ibdsTeamMapper.updateByExampleSelective(team, example);
	}

	@Override
	@Transactional(readOnly = true)
	public String getMaxCode() {
		String maxCode = "";
		try {
			maxCode = teamViewMapper.getMaxCode();
		} catch (Exception e) {
			e.printStackTrace();
			LOG.error("查询数据库出错");
		}
		if (maxCode == null) {
			maxCode = ProductConst.TEAM_CODE_PREFIX + "000000";
		}
		int val = Integer.parseInt(maxCode.substring(2, maxCode.length())) + 1;
		String valStr = String.valueOf(val);
		String code = ProductConst.TEAM_CODE_PREFIX;
		for (int i = 0; i < ProductConst.CODECONST - valStr.length(); i++) {
			code += "0";
		}
		code += valStr;
		return code;
	}

	@Override
	@Transactional(readOnly = true)
	public IBDS_Team getTeamByCode(String code) {
		IBDS_TeamExample example = new IBDS_TeamExample();
		Criteria criteria = example.createCriteria();
		criteria.andTeamnoEqualTo(code);
		List<IBDS_Team> teamList = ibdsTeamMapper.selectByExample(example);
		if (teamList != null && teamList.size() == 1) {
			return teamList.get(0);
		} else {
			LOG.error("项目组 code: " + code + " size " + teamList.size());
			return null;
		}
	}

	/**
	 * 批量新增特性
	 * 
	 * @param record
	 * @return
	 */
	@Override
	@Transactional
	public int insertSelectiveBatch(List<IBDS_Team> teamList) {
		int num = 0;
		if (CollectionUtils.isNotEmpty(teamList)) {
			// 分批次处理，每次处理ProductConst.PRODUCT_COUNT条
			for (int count = 0; count < teamList.size() / ProductConst.PRODUCT_COUNT; count++) {
				List<IBDS_Team> tmpteamList = teamList.subList(count * ProductConst.PRODUCT_COUNT,
						(count + 1) * ProductConst.PRODUCT_COUNT);

				ibdsTeamMapper.insertSelectiveBatch(tmpteamList);
			}

			if (0 != teamList.size() % ProductConst.PRODUCT_COUNT) {
				List<IBDS_Team> tmpfeatureList = teamList
						.subList(teamList.size() - (teamList.size() % ProductConst.PRODUCT_COUNT), teamList.size());

				ibdsTeamMapper.insertSelectiveBatch(tmpfeatureList);
			}

			num = teamList.size();
		}
		return num;
		// return ibdsTeamMapper.insertSelectiveBatch(feature);
	}

	/**
	 * 批量更新
	 * 
	 * @param list
	 * @return
	 */
	@Override
	@Transactional
	public int updateByBatch(List<IBDS_Team> teamList) {
		int num = 0;
		if (CollectionUtils.isNotEmpty(teamList)) {
			// 分批次处理，每次处理ProductConst.PRODUCT_COUNT条
			for (int count = 0; count < teamList.size() / ProductConst.PRODUCT_COUNT; count++) {
				List<IBDS_Team> tmpfeatureList = teamList.subList(count * ProductConst.PRODUCT_COUNT,
						(count + 1) * ProductConst.PRODUCT_COUNT);

				ibdsTeamMapper.updateByBatch(tmpfeatureList);
			}

			if (0 != teamList.size() % ProductConst.PRODUCT_COUNT) {
				List<IBDS_Team> tmpfeatureList = teamList
						.subList(teamList.size() - (teamList.size() % ProductConst.PRODUCT_COUNT), teamList.size());

				ibdsTeamMapper.updateByBatch(tmpfeatureList);
			}

			num = teamList.size();
		}
		return num;
		// return ibdsTeamMapper.updateByBatch(list);
	}

	/**
	 * 批量停用 启用
	 * 
	 * @param param
	 * @return
	 */
	@Override
	@Transactional
	public int updateByStatusBatch(Map<String, Object> param) {
		return ibdsTeamMapper.updateByStatusBatch(param);
	}

	@Override
	public List<IBDS_Team> selectByExample(IBDS_TeamExample example) {
		return ibdsTeamMapper.selectByExample(example);
	}
}
