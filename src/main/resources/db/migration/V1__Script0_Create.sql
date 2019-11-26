drop table if exists avisos_model;
drop table if exists hibernate_sequence;
create table avisos_model (id integer not null, data_do_evento date, descricao varchar(255), titulo varchar(255), primary key (id)) engine=MyISAM;
create table hibernate_sequence (next_val bigint) engine=MyISAM;
insert into hibernate_sequence values ( 1 );