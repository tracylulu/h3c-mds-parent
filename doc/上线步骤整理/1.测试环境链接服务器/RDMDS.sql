exec sp_addlinkedserver  'rdmds_lnk','','RD_MDS','h3cmds02-vs';
exec sp_addlinkedsrvlogin 'rdmds_lnk','false',null,'sa','Hello123';