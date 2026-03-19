DROP PROCEDURE IF EXISTS p7;
delimiter $
CREATE PROCEDURE p7(IN tName VARCHAR(64), IN colList varchar(500), IN valList varchar(500))
begin
 set @x := CONCAT('INSERT INTO ', tName, ' (', colList, ') VALUES (', valList, ') ');
 PREPARE STMT FROM @x;
 EXECUTE STMT;
end $
delimiter ;


