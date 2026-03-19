drop procedure if exists pro1;
delimiter $
create procedure pro1(IN ideptno int)
begin
	select empno,ename,job,sal from 
    emp where empno = x;
end $
delimiter ;