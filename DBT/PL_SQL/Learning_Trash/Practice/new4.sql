drop function if EXISTS login_details;
delimiter $
create function sumofmarks(studentID int) RETURNS int;
deterministic
begin
	select MAX(CASE WHEN name = '10' THEN marks END) AS tenth_marks,
    select MAX(CASE WHEN name = '12' THEN marks END) AS twelfth_marks
	from student_qualifications GROUP by studentID;
end $
delimiter ;