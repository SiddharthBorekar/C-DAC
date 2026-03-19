delimiter $
create procedure pro3(IN iempno int)
begin
	declare flag bool default false;
    select true into flag from emp where empno = x;
    
    if fllag then
		select empno,ename,sal from emp where empno = x;
    else
		select 'Not Found' as 'massage Box';
	end if;
end $
delimiter ;