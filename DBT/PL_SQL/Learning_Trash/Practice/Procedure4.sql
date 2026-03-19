drop procedure if exists pro5;
delimiter $
create procedure pro5(IN ideptno int ,IN iname varchar(20))
begin
	insert into dept(deptno,dname) values(ideptno,iname);
    select 'record inserted' as R1;
end $
delimiter ;