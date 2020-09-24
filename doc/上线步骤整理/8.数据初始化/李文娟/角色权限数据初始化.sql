--IPMT 执行秘书的统一加上IPMT执行秘书角色
insert into IBDS_User_Role
select distinct s.uda_10_511,'R_000002' from (select PLIMPT_Secretary,e.uda_10_511 from IBDS_PLIPMT p left join  tbl_2_10_EN e on p.PLIMPT_Secretary=e.uda_10_509+' '+Code) s
where s.uda_10_511 is not null and s.uda_10_511<>'' and not exists (select HURR_HUL_CODE from IBDS_User_Role where HURR_HUL_CODE =s.uda_10_511  and HURR_HRL_CODE='R_000002')


--POP 加上POP角色
insert into IBDS_User_Role
select distinct s.uda_10_511,'R_000003' from (select distinct p.POP_ID,e.uda_10_511 from (
select POP_ID from IBDS_PDT where POP_ID<>'' and POP_ID is not null
union all
select POP_ID from IBDS_PRODUCT where POP_ID<>'' and POP_ID is not null
union all
select POP_ID from IBDS_VERSION where POP_ID<>'' and POP_ID is not null
union all
select POP_ID from IBDS_RELEASE where POP_ID<>'' and POP_ID is not null
union all
select POP_ID from IBDS_bversion where POP_ID<>'' and POP_ID is not null
) p  inner join  tbl_2_10_EN e on p.POP_ID=e.uda_10_509+' '+Code) s
where s.uda_10_511 is not null and s.uda_10_511<>'' and not exists (select HURR_HUL_CODE from IBDS_User_Role where HURR_HUL_CODE =s.uda_10_511  and HURR_HRL_CODE='R_000003')


--CMO加上CMO角色
insert into IBDS_User_Role
select distinct s.uda_10_511,'R_000004' from (select distinct p.CMO_ID,e.uda_10_511 from (
select CMO_ID from IBDS_PDT  where CMO_ID<>'' and CMO_ID is not null
union all
select CMO_ID from IBDS_PRODUCT  where CMO_ID<>'' and CMO_ID is not null
union all
select CMO_ID from IBDS_VERSION  where CMO_ID<>'' and CMO_ID is not null
union all
select CMO_ID from IBDS_RELEASE  where CMO_ID<>'' and CMO_ID is not null
union all
select CMO_ID from IBDS_bversion  where CMO_ID<>'' and CMO_ID is not null
) p  inner join  tbl_2_10_EN e on p.CMO_ID=e.uda_10_509+' '+Code) s
where s.uda_10_511 is not null and s.uda_10_511<>'' and not exists (select HURR_HUL_CODE from IBDS_User_Role where HURR_HUL_CODE =s.uda_10_511  and HURR_HRL_CODE='R_000004')


--管理员默认现有人员不变
--两个角色授权取自于PDT信息的财务接口人，研发相关PDT的财务接口人授权为研发财务代表，技服相关PDT财务接口人授权技服财务代表
insert into IBDS_User_Role 
select distinct FPROD_PERSON,'7' from IBDS_PROCESS_CONFIG_ITEM s where CONFIG_CODE='processPDT' and FPROD_PERSON is not null and CODE is not null and
not exists (select HURR_HUL_CODE from IBDS_User_Role where HURR_HUL_CODE =s.FPROD_PERSON  and HURR_HRL_CODE='7')


insert into IBDS_User_Role 
select distinct FPROD_PERSON,'9' from IBDS_PROCESS_CONFIG_ITEM s where CONFIG_CODE='processPDT' and FPROD_PERSON is not null and CODE is null and
not exists (select HURR_HUL_CODE from IBDS_User_Role where HURR_HUL_CODE =s.FPROD_PERSON  and HURR_HRL_CODE='9')

--技服管理员
--待加--caiyi 18376
insert into IBDS_User_Role
select distinct s.uda_10_511,'R_000008' from tbl_2_10_EN s where not exists (select HURR_HUL_CODE from IBDS_User_Role where HURR_HUL_CODE =s.uda_10_511) and 
s.uda_10_511 is not null and s.uda_10_511<>'' and code='18376'


--其他添加普通用户角色
insert into IBDS_User_Role
select distinct s.uda_10_511,'R_000005' from tbl_2_10_EN s where not exists (select HURR_HUL_CODE from IBDS_User_Role where HURR_HUL_CODE =s.uda_10_511) and 
s.uda_10_511 is not null and s.uda_10_511<>''


