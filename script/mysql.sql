--mysql
crease database DBMSProject1;

drop table team_member;

create table team_member(
	id varchar(20) ,
	name varchar(20) not null,
	birthday date not null,
	hobby varchar(20) not null,
	primary key(id)
);

insert into team_member values ("2018141431155","Mingrui Ji","2000-3-31","swim");
insert into team_member values ("2018141411321","YiDan Han","2000-11-24","badmintons");
insert into team_member values ("2019141440307","Chenzhao Huang","2001-5-1","basketball");
insert into team_member values ("2019141490105","Wenhan Wu","2000-12-23","guitar");