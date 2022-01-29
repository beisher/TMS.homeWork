select * from users where birthday > '1995-01-01';

-------------------------------------------

select count(id),sex from users group by sex;

-------------------------------------------

select * from user_hobby join users on user_hobby.user_id = users.id join infohobby on user_hobby.hobby_id = infohobby.id;

-------------------------------------------

select u.id , u.name , u.sex  , u.birthday from users u
join user_hobby uh on uh.user_id = u.id
group by u.id having count(*)>1 order by u.id;

-----------------------------------------
select * from users  u
	join user_hobby uh on uh.user_id = u.id
	join infohobby i on i.id = uh.hobby_id
	join type_hobby th on th.id = i.type
where th.typehobby = 'passive'
and u.id
not in (select u1.id from users  u1
	join user_hobby uh1 on uh1.user_id = u1.id
	join infohobby i1 on i1.id = uh1.hobby_id
	join type_hobby th1 on th1.id = i1.type
where th1.typehobby = 'active');

-------------------------------------------

select th.typehobby, count(i.type) from users u
	join user_hobby uh on uh.user_id = u.id
	join infohobby i on i.id = uh.hobby_id
	join type_hobby th on th.id = i.type
group by th.typehobby;

-------------------------------------------

select i.name , th.typehobby from infohobby i join type_hobby th on th.id = i.type ;