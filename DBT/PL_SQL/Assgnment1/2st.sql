drop procedure if exists checkusser ;
delimiter $
create procedure p5(IN ID int,IN curr_date date,curr_time datetime,IN massage varchar(20))
begin
	
delimiter ;