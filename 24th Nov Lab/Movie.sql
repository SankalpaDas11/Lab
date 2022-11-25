use mydb;
create table CUSTOMER2( Customer_id varchar(5) primary key, 
					Fname Varchar(15) not null,
					Lname Varchar(15) not null,
                    Area char(2) not null,
                    Phone bigint(10),
                    DOB date, 
                    Payment float(6,2));
insert into CUSTOMER2 values ('A01', 'Ivan', 'Ross', 'SA', 6125467, '1999-01-15', 800.50);
insert into CUSTOMER2 values ('A02', 'Vandana', 'Roy', 'MU', 5560379, '1987-12-20', 1000.75);
insert into CUSTOMER2 values ('A03', 'Pramada', 'Jaugutse', 'DA', 4560389, '1967-07-25', 500.00);
insert into CUSTOMER2 values ('A04', 'Basu', 'Navindi', 'BA', 6125401, '1956-02-28', 860.00);
insert into CUSTOMER2 values ('A05', 'Ravi', 'Shridhar', 'NA', null, '1989-12-15', 500.50);
insert into CUSTOMER2 values ('A06', 'Rukmini', 'Aiyer', 'GH', 5125274, '1987-07-23', 1500.50);

create table Movie( Mv_no int primary key, 
					Cust_id Varchar(5),
					Title Varchar(15) not null,
                    Star char(2) not null,
                    Price bigint(3));

insert into Movie values (1, 'A02', 'Bloody', 'JC', 181); 
insert into Movie values (2, 'A04', 'The Firm', 'TC', 200); 
insert into Movie values (3, 'A01', 'Pretty Women', 'RG', 151); 
insert into Movie values (4, 'A06', 'Home Alone', 'MC', 150); 
insert into Movie values (5, 'A05', 'The Fugitive', 'MF', 200); 
insert into Movie values (6, 'A03', 'Coma', 'MD', 100); 
insert into Movie values (7, 'A02', 'Dracula', 'GO', 150); 
insert into Movie values (8, 'A06', 'Quick Change', 'BM', 100); 
insert into Movie values (9, 'A03', 'Gonewiththewind', 'CB', 200); 

alter table Movie add foreign key(Cust_id) references CUSTOMER2(Customer_id);
select Title from Movie where Price>100 and price<200;
select Title from Movie where  Star = 'JC' or Star = 'TC' or Star='MC';
select * from CUSTOMER2 where Area like '%A';
select Title from Movie where Price<180 and LENGTH (Title) = 6;
select Title, Price, Price*1.10 as Increament from Movie;
select Fname from CUSTOMER2 where Phone is null;
update CUSTOMER2 set Phone = 6291259 where Fname = 'Ravi';
select distinct Cust_id from Movie;
delete from CUSTOMER2 where Customer_id = 'A01';
delete from Movie where Mv_no = 1;