/*Drop PROCEDURE if EXISTS addUser;
delimiter $
	create procedure addUser(In iusername varchar(20),IN ipassword varchar(20),IN iemail varchar(50))
BEGIN
	Insert into login1(username,password,email) values (iusername,ipassword,iemail);
	select "Record Inserted as R1";
end $
delimiter ;*/	


/*Drop procedure if exists checkUser;

delimiter $

create procedure checkUser(IN email_ID varchar(50))
Begin
	declare x varchar(20);
	select email into x from login1 where email = email_ID;
	IF x = email_ID THEN
		select username,password from login1 where email = email_ID;
	ELSE
		insert into log1(curr_date,curr_time,message)values
		(curdate(),curtime(),"log update");
		select "Record insertes of log1 as R2";
	End if;
end $
delimiter ;*/