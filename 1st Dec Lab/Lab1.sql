use mydb;
create table Employee (e_id int(3) primary key, e_name varchar(15) unique not null, e_address varchar(20),
 e_salary float(6,2) unique not null check(e_salary between 1000 and 30001), 
e_contact bigint(12) unique);
create table Department(D_ID INT(3) PRIMARY KEY,D_NAME VARCHAR(10) UNIQUE NOT NULL,D_HEAD VARCHAR(10) UNIQUE NOT NULL,D_DESC VARCHAR(10) UNIQUE NOT NULL);

alter table Employee add d_id int(3) unique after e_contact;
alter table Employee add foreign key (d_id) references Department(d_id);
