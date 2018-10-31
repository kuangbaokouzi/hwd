/*==============================================================*/
/* DBMS name:      MySQL 5.0                                    */
/* Created on:     2018/10/31 ÐÇÆÚÈý 15:04:40                      */
/*==============================================================*/


drop table if exists HelloWorld;

/*==============================================================*/
/* Table: HelloWorld                                            */
/*==============================================================*/
create table HelloWorld
(
   id                   bigint not null,
   firstName            text,
   lastName             text,
   primary key (id)
);

