-- To declare variable in procedure

drop procedure if exists p9;
delimiter $
create procedure p9()
begin
	declare x int;
    declare y int;
    select x,y ;
end $
delimiter ;