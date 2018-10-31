/*==============================================================*/
/* DBMS name:      MySQL 5.0                                    */
/* Created on:     2018/10/31 ������ 15:04:40                      */
/*==============================================================*/


drop table if exists HWD_HelloWorld;

/*==============================================================*/
/* Table: HelloWorld                                            */
/*==============================================================*/
create table HWD_HelloWorld
(
   id                   bigint not null,
   firstName            text,
   lastName             text,
   primary key (id)
);

