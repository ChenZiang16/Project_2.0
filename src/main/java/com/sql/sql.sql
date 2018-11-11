create table users(usr_id integer not null primary key,name varchar(24) not null,gender char(1),birthday timestamp,nation varchar(12),address varchar(256))

alter table users add column password varchar(24)

select * from users

drop table user_roles

create table roles(role_id integer not null primary key,role_name varchar(12))

create table Permission(per_id integer not null primary key , per_name varchar(12))

create table user_roles(user_id integer not null ,role_id integer not null,create_date timestamp,updated_time timestamp )

alter table user_roles add constraint  PK_FA PRIMARY KEY (user_id,role_id)

create table role_permission(role_id integer not null,per_id integer not null,create_date timestamp,updated_time timestamp)

alter table role_permission add constraint  PK_FA PRIMARY KEY (role_id,per_id)

create table menu(menu_id integer not null primary key,menu_name varchar(24),level integer,parent_id integer,link_url varchar(256),is_valid char(1),create_date timestamp,updated_time timestamp)

create table role_menus(role_id integer not null,menu_id integer not null,create_date timestamp,updated_time timestamp)

alter table role_menus add constraint  PK_FA PRIMARY KEY (role_id,menu_id)


insert into menu values(9001,'MANAGER',1,0,'','Y','2018-10-01 00:00:00','2018-10-01 00:00:00')

insert into role_menus values(2001,9001,'2018-10-01 00:00:00','2018-10-01 00:00:00')