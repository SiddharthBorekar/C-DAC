drop procedure if exists display;
delimiter $
create procedure display() -- sequence imp
	begin
		select "Cube";
        call add1(12);
	end $
    delimiter ;
    
drop procedure if exists add1;
delimiter $
create procedure add1(IN x int) -- sequence imp
	begin
		select x * x * x as CubeNO;
	end $
delimiter ;