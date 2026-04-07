-- 1.	List all courses.
table course;         or         select * from course;

-- 2.	List namefirst, namelastof all student.
select namefirst,namelast from student;

-- 3.	List namefirst, namelast,DOB and emailID of all students.
select namefirst ,namelast ,DOB,emailID from student;

-- 4.	Display student information of the ID is 15.
select * from student where ID = 15;

-- 5.	List namefirst, namelast, and emailIDofstudentwhosestudent namefirstis ‘Nitish’.
select namefirst,namelast,emailID from student where namefirst = "Nitish";

-- 6.	List all students having IDgreater than equal to 12.
select * from student where ID >= 12;

-- 7.	List all student detailswhose DOB is ‘1980-12-01’
select * from student where DOB = "1980-12-01";

-- 8.	Display the phone details where student ID is 5;
select * from student_phone where ID = 5;

-- 9.	List studentaddress whosestudent ID is 10.
select * from student_address where ID = 10;

-- 10.	List all faculty details.
select * from faculty;

-- 11.	List all phone number whose faculty ID is 2.
select * from faculty where ID = 2;

-- 12.	List all phone number whose student ID is 13.
select * from student_phone where studentID = 13;

-- 13.	List all modules.
select * from modules;

-- 14.	List thecourse_modules whose courseID is 1.
select * from course_modules where courseId = 1;

-- 15.	Display all course_batches who’s sitting capacity is 80. 
select * from course_batches where capacity = 80;
