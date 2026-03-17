drop procedure if exists p3;
delimiter $
create procedure p3(x varchar(20), z int)
begin
	if z = 'Pune' then
    insert into a(c2,c3) values (y,z);
    select "Record inserted...";
    else
    select "Invalid city";
    end if;
    end $
    delimiter ;