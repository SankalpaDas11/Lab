use mydb;
create table CUSTOMER( Cust_id varchar(5) not null, 
					Fname Varchar(15) not null,
					Lname Varchar(15) not null,
                    Area char(2) not null,
                    Phone bigint(10),
                    DOB date, 
                    Payment float(6,2));
insert into CUSTOMER values ('A01', 'Ivan', 'Ross', 'SA', 6125467, '1999-01-15', 800.50);
insert into CUSTOMER values ('A02', 'Vandana', 'Roy', 'MU', 5560379, '1987-12-20', 1000.75);
insert into CUSTOMER values ('A03', 'Pramada', 'Jaugutse', 'DA', 4560389, '1967-07-25', 500.00);
insert into CUSTOMER values ('A04', 'Basu', 'Navindi', 'BA', 6125401, '1956-02-28', 860.00);
insert into CUSTOMER values ('A05', 'Ravi', 'Shridhar', 'NA', null, '1989-12-15', 500.50);
insert into CUSTOMER values ('A06', 'Rukmini', 'Aiyer', 'GH', 5125274, '1987-07-23', 1500.50);

desc CUSTOMER;
select * from CUSTOMER;
insert into CUSTOMER values ('A07', 'Sourav', 'Ganguly', 'GH', 6290123, '1986-10-14', 1200.50);
select * from CUSTOMER;
update CUSTOMER set Phone = 9674120 where Cust_id = 'A02';
update CUSTOMER set Phone = 9432273 where Cust_id = 'A04';
update CUSTOMER set DOB = '1985-05-05' where Cust_id = 'A03';
update CUSTOMER set DOB = '1984-12-10' where Cust_id = 'A05';
select * from CUSTOMER;
DELETE FROM CUSTOMER WHERE Cust_id='A01';
DELETE FROM CUSTOMER WHERE Cust_id='A05';
truncate CUSTOMER;

insert into CUSTOMER values ('A07', 'Sankalpa', 'Das', 'SA', 6125467, '1999-01-15', 800.50);
insert into CUSTOMER values ('A08', 'Sanmitra', 'Roy', 'MU', 5560379, '1987-12-20', 1000.75);
insert into CUSTOMER values ('A09', 'Shibajee', 'Chatterjee', 'DA', 4560389, '1967-07-25', 500.00);
insert into CUSTOMER values ('A10', 'Sohini', 'Sarkar', 'BA', 6125401, '1956-02-28', 860.00);
insert into CUSTOMER values ('A11', 'Rakesh', 'Shaw', 'NA', null, '1989-12-15', 500.50);
update CUSTOMER set Lname = 'Basu' where Cust_id = 'A08';
DELETE FROM CUSTOMER WHERE Payment=500.50;
