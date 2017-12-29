create database db_user;
use db_user;
create table t_roles(
  roleId int primary key identity(1,1),
  roleName varchar(20) not null,
  memo varchar(20)
)
create table t_userInfo(
   userId int primary key not null,
   userName  varchar(20) not null,
   password varchar(20) not null
)
create table roles_userInfo(
   id int primary key identity(1,1),
   roleId int,
   userId int 
)
select * from t_roles;
select * from t_userInfo;
select * from roles_userInfo;
insert into t_userInfo values (1,'lala','12345');
