/*drop procedure if EXISTS Prog1;
Delimiter $
create procedure Prog1(IN X int,IN Y int)
BEGIN
	select X+Y;
end $
delimiter ;*/


/*drop procedure If exists prog1;
delimiter $
	create Procedure Prog1(IN X int , OUT Y int)
BEGIN
	set Y = X*X;
end $
delimiter ;*/

/* que 1. To check cube of number prog1 */

drop Procedure if exists prog1;
delimiter $
create procedure Prog1(IN X int,OUT Y int)
BEGIN
	set Y = X * X;
END $
delimiter ;
	
