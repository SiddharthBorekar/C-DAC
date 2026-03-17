drop procedure if exists prof;
delimiter $
create procedure prol(x int)
begin
	if x < 10 then
		select "lessthen 10";
    elseif x > 11 then
		select "greaterthan";
	else
		select"Good";
    end $
    delimiter ;