drop procedure if exists p4;
delimiter $
create procedure p4(x varchar(20),iID int) -- sequence imp
begin
	declare X varchar(20);
    declare exit handler for sqlexception
	begin
		rollback;
        select "Rollbacked...";
    end;
    start transaction read write;
		insert into student1 values (iID,x);-- sequence imp
        -- insert into T2 values (101,1);
        commit;
			select "Record inserted....";
end $
    delimiter ;