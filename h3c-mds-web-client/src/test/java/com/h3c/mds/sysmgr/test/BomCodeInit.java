package com.h3c.mds.sysmgr.test;

import com.h3c.mds.WebApplication;
import com.h3c.mds.finance.dao.FProductCodeMapper;
import com.h3c.mds.finance.entity.FProductCode;
import com.h3c.mds.finance.entity.FProductCodeExample;
import com.h3c.mds.finance.service.FProductCodeService;
import com.h3c.mds.flowable.entity.Bom;
import com.h3c.mds.flowable.service.BomService;
import com.h3c.mds.utils.redis.RedisUtil;
import org.apache.commons.lang3.StringUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//@RunWith(SpringJUnit4ClassRunner.class)
//@SpringBootTest(classes = {WebApplication.class})
//@Transactional
public class BomCodeInit {

    //@Autowired
    private BomService bomService;
    //@Autowired
    private RedisUtil redisUtil;
    //@Autowired
    private FProductCodeMapper fProductCodeMapper;

    //@Test
    public void initBomCode(){
        List<Bom> all = bomService.getAll();
        int i = 1;
        for (Bom bom : all){
            redisUtil.hset("BOM_CODE", bom.getS1partnumber(), bom.getS1partdescelements());
            System.out.println(i++);
        }
    }

    //@Test
    public void regexBomCode(){
        FProductCodeExample example = new FProductCodeExample();
        List<FProductCode> list = fProductCodeMapper.selectByExample(example);
        String regex = "[\\u4E00-\\u9FA5\\s]";
        Pattern pattern = Pattern.compile(regex);
        Map<String,String> map = new HashMap<>();
        for(FProductCode fProductCode : list){
            String bomCode = fProductCode.getBomCode();
            bomCode = bomCode.replace(" ", "");
            Matcher matcher = pattern.matcher(bomCode);
            while (matcher.find()){
                if(map.containsKey(fProductCode.getProductCode())){
                    String s = map.get(fProductCode.getProductCode());
                    s += ","+matcher.group();
                    map.put(fProductCode.getProductCode(), s);
                }else{
                    map.put(fProductCode.getProductCode(), matcher.group());
                }

            }
        }
        Set<String> strings = map.keySet();
        for(String s : strings){
            System.out.println("'"+s+"',");
        }
    }

    public static void main(String[] args){
        boolean noneBlank = StringUtils.isNoneBlank("");
        System.out.println(noneBlank);
    }
}
