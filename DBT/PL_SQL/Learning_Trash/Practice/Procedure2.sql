drop procedure if exists pro2;
delimiter $
create procedure pro2(IN x int,out y int)
begin
	set y = x * x;
end $
delimiter ;