drop procedure if exists pro6;
delimiter $
create procedure pro6()
begin
	declare x int default 0;
	lb1 : loop
    set x = x + 2;
    select x;
		if x = 20 then
			leave lb1;
		end if;
	end loop lb1;
end $ 
delimiter ;	