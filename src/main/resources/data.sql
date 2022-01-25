insert into member(name) values('김예림');
insert into member(name) values('김혜림');
insert into member(name) values('홍길동');
insert into member(name) values('이종성');

insert into category(name) values('피아노');
insert into category(name) values('발레');
insert into category(name) values('영어');
insert into category(name) values('Spring');
insert into category(name) values('Java');
insert into category(name) values('안드로이드');

insert into member_category(category_id, member_id) values(1, 1);
insert into member_category(category_id, member_id) values(2, 1);
insert into member_category(category_id, member_id) values(4, 1);
insert into member_category(category_id, member_id) values(1, 2);
insert into member_category(category_id, member_id) values(1, 3);
insert into member_category(category_id, member_id) values(5, 4);
insert into member_category(category_id, member_id) values(6, 4);