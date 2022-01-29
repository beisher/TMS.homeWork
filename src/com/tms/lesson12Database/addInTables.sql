insert into users (name, sex, birthday) values
                               ('Andrei' , true , '1995-09-15'),
                               ('Sergei' , true , '1996-12-11'),
                               ('Petya' , true , '2005-07-23'),
                               ('Valera' , true , '2000-11-13'),
                               ('Masha' , false , '1991-10-17'),
                               ('Ksenia' , false , '1992-09-01'),
                               ('Olya' , false , '1997-05-02'),
                               ('Misha' , true , '1988-05-17'),
                               ('Kolya' , true , '2003-03-19'),
                               ('Varvara' , false , '1999-04-27');
select * from users;

insert into infoHobby (name, type) values
 ('Hockey' , 1),
 ('Football',1),
 ('Reading book', 2),
 ('Sleeping', 2);

select * from infoHobby;

 insert into type_hobby (typeHobby) values
   ('active'),
   ('passive');

  select * from type_hobby;

 insert into user_Hobby (user_id , hobby_id) values

 (1,1),
 (1,3),
 (2,1),
 (3,2),
 (4,1),
 (4,3),
 (5,2),
 (5,4),
 (6,4),
 (7,3),
 (8,4),
 (9,2),
 (10,1),
 (10,4);

 select * from user_Hobby;