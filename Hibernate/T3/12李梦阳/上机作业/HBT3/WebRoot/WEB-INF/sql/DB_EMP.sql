CREATE DATABASE DB_EMP
USE DB_EMP
GO
--�����û���
CREATE TABLE EMP(
	eid int primary key identity(1,1),
	ename varchar(30) not null,
	esex varchar(1) not null,
	did int
)
--�������ű�
CREATE TABLE DEPT(
)
--�����û��˺ţ������
CREATE TABLE USERINFO(
	uid int primary key,
	uname varchar(30) not null,
	upwd varchar(30) not null
)