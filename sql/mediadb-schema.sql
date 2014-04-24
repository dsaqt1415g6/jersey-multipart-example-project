drop database if exists mediadb;
create database mediadb;

use mediadb;

create table images (
	imageid	varchar(36) not null primary key,
	title	char(50) not null
);
