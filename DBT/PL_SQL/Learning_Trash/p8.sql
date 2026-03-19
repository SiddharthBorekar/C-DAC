drop trigger if exists tr1;
delimiter $
create trigger tr1 before insert on dept for each row
	begin
		insert into bkdept values (new.deptno,new.dname,new.loc,new.pwd,new.startedon);
	end $
    delimiter ;