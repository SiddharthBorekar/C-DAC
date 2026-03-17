drop procedure if exists p2;
delimiter $

create procedure p2(y varchar(10),z varchar(30))
begin
	-- insert into collage values (y,z);
    select * from collage;
    -- insert into a(c2,c3) values (x,y);
	end $
delimiter ;