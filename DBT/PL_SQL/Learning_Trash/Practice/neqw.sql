drop function if EXISTS F1;
delimiter $
create function F1(ideptno int) RETURNS int
deterministic
BEGIN
	declare sumsal int;
	select sum(sal) into sumSal from emp where ideptno = deptno;
	return sumsal;
end $
delimiter ;
