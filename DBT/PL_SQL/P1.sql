drop procedure if exists pro1;
delimiter $
create procedure pro1(x int)
begin
	if x < 10 then
		select "lessthen 10";
    elseif x > 11 then
		select "greaterthan";
	else
		select"Good";
    
    
    end if;
    end $
    delimiter ; 