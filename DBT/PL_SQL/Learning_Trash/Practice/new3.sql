drop function if EXISTS login_details;
delimiter $
create function login_details(iemail varchar(200)) RETURNS varchar(200)
deterministic
begin
	declare var1 varchar(200);
	select concat(username,password) into var1 from login where email = iemail limit 1;
	if var1 is null THEN
		return "Employee not exists";
	end if;
	
	return var1;
end $
delimiter ;