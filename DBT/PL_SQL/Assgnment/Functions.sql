-- •	Pass DEPTNO to the function (named sumSalary) and calculate the sum of salary.(Use: EMP table)
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

-- •	Create a new table called STUDENT_NEW having following columns (studentID, namefirst, namelast, DOB, and emailID). Write a function names autoNumberto return auto generate studentID and return the new value (Use: STUDENT_NEW table).
drop function if EXISTS AutoNumber ;
delimiter $
create function AutoNumber() RETURNS int
deterministic
begin
	declare var1 int ;
	select max(ID) + 1 into var1 from newstudent;
	
	return var1;
end $
delimiter ;

-- •	Write a function which will accept email-ID from the user, if the email-ID is present return his username and password or else `Return “Employee not exists”. (Use: LOGIN table)
drop function if EXISTS login_details;
delimiter $
create function login_details(iemail varchar(200)) RETURNS varchar(200)
deterministic
begin
	declare var1 varchar(200);
	select concat(username,password) into var1 from login where email = iemail     limit 1;
	if var1 is null THEN
		return "Employee not exists";
	end if;
	
	return var1;
end $
delimiter ;

-- Write a function which will accept drop function if exists acceptID;
delimiter @
create function acceptID(student_ID int) returns int
deterministic
begin
	declare totalSum int;

	select ifnull(sum(marks),0) 
	into totalSum 
	from student_qualifications 
	where name in (10,12,'BE') and studentID = student_ID;

	return totalSum;
end @
delimiter ; from the user and calculate the sum of (10th, 12th, and BE) marks.