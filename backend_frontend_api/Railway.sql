create database reservation;
use reservation;
show tables;
select * from users;
select * from roles;
select * from reservation;
select * from train_details;
drop table role;

desc uer_roles;

INSERT INTO roles(name) VALUES('ROLE_USER');
INSERT INTO roles(name) VALUES('ROLE_MODERATOR');
INSERT INTO roles(name) VALUES('ROLE_ADMIN');

drop table pay_info;

	delimiter //
	
	CREATE PROCEDURE dorepeat(p1 INT)
BEGIN
  SET @x = 0;
  REPEAT SET @x = @x + 1; UNTIL @x > p1 END REPEAT;
END //

	delimiter ;
    
    CALL dorepeat(1000);

















# login
create table login_credentials ( login_id int primary key, password varchar(8));

#Register
create table registration ( username varchar(30), password varchar(8),age int, phone numeric, email varchar(30), gender varchar(10)); 

# Ticket Reservation
create table Ticket_reservation ( PNR_no int primary key, to_date date, from_date varchar(20), to_station varchar(20),
from_station varchar(20), Train_no int);
drop table Ticket_reservation;

#Train 
create table Train (Train_no int primary key, distance numeric, Train_name varchar(20), Start_time time, End_time time,
Start_Station_Code numeric, End_Station_Code numeric);

#Train Fare
create table ticket_fare (to_date date, from_date date, to_km numeric, from_km numeric, fare int, class_id int);

#Seat Availability
create table seat_availability (train_no int, class_code int, number_of_seats int);

#Class
create table class (Class_id int primary key, coach_prefix varchar(10), class_code int, Class_name varchar(10), seat_per_coach int);

#Station
create table station (station_id int primary key, station_code int, station_name varchar(20));

#pay
create table pay_info (payment_id int primary key, pay_mode varchar(20), amount numeric, pay_date date, PNR_no numeric);