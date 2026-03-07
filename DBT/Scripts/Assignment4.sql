-- List all student.
select * from student where 1;
-- List namefirst, namelastof all students in ascending order of namefirst.
select namefirst,namelast from student order by namefirst ;
-- List namefirst, namelast, DOB, and emailIDfor the first 5 students.
select namefirst,namelast,DOB,emailID from student limit 5;
-- Display student information of the studentID is either 1, 2, 5 or 7.	
select * from student where ID = 1 or ID = 2 or ID = 5 or ID = 7;
-- List namefirst, namelast, and emailIDofstudentwhosestudentID is not5, 10, 15, display first 7 rows only.
select namefirst, namelast, emailID from student where ID not in (5,10,15);
-- List first two faculty details only.
select * from faculty limit 2;
-- List all student_phone numberin ascending order of phone number.
select number from student_phone order by number;
-- Display the student_address whose studentID is either 2, 4, 6 or 10 in descending order of studentID.
select address,studentID from student_address where studentID in (2,4,6,10) order by studentID ;
-- List all modulesin ascending order of module names.
select name from modules order by name;
-- List first 10modulesafter arranging the module name in descending order.
select name from modules order by name desc limit 10;
-- List all student_qualification whose college is ‘New York’.
select * from student_qualifications where college = 'New York';
-- List all student_qualification whose have done “BE” from “Florida” college.
select * from student_qualifications where name = "BE" and college = "Florida";
-- List all student_qualifications whose passed the college in the year 2012 and have scored more than 67% marks.
select * from student_qualifications where year = 2012 and marks = 67;
-- List the qualification details for the faculty number 1, and 3.
select *  from faculty where id = 1 or id = 3;
-- or
select *  from faculty where id in (1,3);
-- Display the name, college, and university from the student_qualification who have passed in the year 2018.
select name , college , university, year from student_qualifications where year = 2018;

