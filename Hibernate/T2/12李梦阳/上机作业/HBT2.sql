create database db_emp;
use db_emp;
go

--�û���
create table emp(
eid int primary key identity(1001,1),
ename nvarchar(20) not null,
esex char(2) not null,
ebirth nvarchar(20) not null,
did int
)

--�û���Ϣ��
create table userInfo(
id int primary key,
name nvarchar(20) not null,
pwd nvarchar(20) not null
)

