-- 1. To declare variable in procedure

-- drop procedure if exists p9;
-- delimiter $
-- create procedure p9()
-- begin
-- 	declare x int;
--     declare y int;
--     select x,y ;
-- end $
-- delimiter ;


-- 2.
-- drop procedure if exists p9;
-- delimiter $
-- create procedure p9()
-- begin
-- 	declare x int default 200;
--     declare y int default 300;
--     select x+y as Sum;
-- end $
-- delimiter ;



-- 3. user passing parameters 
drop procedure if exists p9;
delimiter $
create procedure p9(IN x int, IN y int)
begin
    select x/y as Sum;
end $
delimiter ;
