CREATE DATABASE DB_EMP
USE DB_EMP
GO
--创建用户表
CREATE TABLE EMP(
	eid int primary key identity(1,1),
	ename varchar(30) not null,
	esex varchar(1) not null,
	did int
)
--创建部门表
CREATE TABLE DEPT(
)
--创建用户账号，密码表
CREATE TABLE USERINFO(
	uid int primary key,
	uname varchar(30) not null,
	upwd varchar(30) not null
)