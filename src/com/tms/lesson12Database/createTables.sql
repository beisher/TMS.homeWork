create table if not exists users (
id bigserial,
name varchar(30),
sex bool not null,
birthday date,
primary key (id)
);
-----------------------------------------------------
drop table if exists users;
-----------------------------------------------------
create table if not exists infoHobby (
id bigserial,
name varchar(30),
type  bigserial,
primary key (id),
foreign key (type) references type_hobby (id)
);
-----------------------------------------------------
drop table infoHobby;
-----------------------------------------------------
create table if not exists type_hobby (
id bigserial,
typeHobby varchar(30),
primary key (id)
);
-----------------------------------------------------
drop table type_hobby;
-----------------------------------------------------
create table if not exists user_Hobby (
id bigserial,
user_id bigserial,
hobby_id bigserial,
foreign key (user_id) references users (id),
foreign key (hobby_id) references infoHobby (id)
);
-----------------------------------------------------
drop table user_Hobby;
-----------------------------------------------------