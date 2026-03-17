drop procedure if exists p5;
delimiter $
create procedure p5(IN username varchar(20),pass varchar(20),email varchar(20))
	begin
		insert into login values(username,pass,email);
	end $
delimiter ;