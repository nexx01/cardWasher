insert into driver(id,name,surname,phone,address) values(1,'x1','y1','phone1','address1');
insert into driver(id,name,surname,phone,address) values(2,'x2','y2','phone2','address2');
insert into driver(id,name,surname,phone,address) values(3,'x3','y3','phone3','address3');
insert into driver(id,name,surname,phone,address) values(4,'x4','y4','phone4','address4');

insert into car(id,model,color,driver_id,year) values (1,'fod','black',1,2015);
insert into car(id,model,color,driver_id,year) values (2,'fod2','black2',2,2016);
insert into car(id,model,color,driver_id,year) values (3,'fod3','black3',3,2017);
insert into car(id,model,color,driver_id,year) values (4,'fod4','black4',4,2018);
--
--insert into carwash(id,price,date,driver_id,car) values(1,10,to_date(01.02.2019,'DD.MM.YYYY'),1,1);
--insert into carwash(id,price,date,driver_id,car) values(1,20,to_date(02.02.2019,'DD.MM.YYYY'),2,2);
--insert into carwash(id,price,date,driver_id,car) values(1,10,to_date(03.02.2019,'DD.MM.YYYY'),3,3);
--insert into carwash(id,price,date,driver_id,car) values(1,10,to_date(04.02.2019,'DD.MM.YYYY'),4,5);

insert into users(username, password, enabled) values('user1','(noop)1234',true);
insert into users(username, password, enabled) values('user2','(noop)1234',true);
insert into users(username, password, enabled) values('user3','(noop)1234',true);

insert into authorities(username,authority) values('user1','ROLE_USER');
insert into authorities(username,authority) values('user2','ROLE_ADMIN');
insert into authorities(username,authority) values('user3','ROLE_USER');