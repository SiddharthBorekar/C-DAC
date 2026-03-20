drop function if EXISTS AutoNumber ;
delimiter $
create function AutoNumber() RETURNS int
deterministic
begin
	declare var1 int ;
	select max(ID) + 1 into var1 from newstudent;
	
	return var1;
end $
delimiter ;
