-- 1.	Get student namefirst with how many characters are there in their namefirst.
select namefirst,length(namefirst) R1 from student;

-- 2.	Get student details whose namefirst is having 4 characters only.
select namefirst from student where length(namefirst) = 4;

-- 3.	Get the ASCII value of the 3rd character of namefirst column.
select namefirst ,ascii(substr(namefirst,3,3)) R1 from student;

-- 4.	Get namefirst and namelast in lowercase.
select namefirst, namelast ,lower(namefirst) R1, lower(namelast) R2 from student ;

-- 5.	Get (namefirst, namelast, and emailID) all 7 letter emailID.
 select namefirst, namelast , emailID , substr(emailID,1,7) R1 from student;

-- 6.	Get(namefirst, namelast and first 3 letters of namefirst) for all students.
select namefirst, namelast ,substr(namefirst,1,3)R2 from student ;

-- 7.	Get(namefirst, namelast and last 3 letters of namefirst) for all student.
select namefirst, namelast ,substr(namefirst,-3)R2 from student ;

-- 8.	Get all students(phone number) whose phone number starts with 70.
select number from student_phone where number like '70%';

-- 9.	Get student details of first 5 students.
select * from student limit 5;

-- 10.	Get student details of last 5 students.
select * from student order by id desc limit 5;

-- 11.	Get student details in ascending order of namefirst.
select * from student order by namefirst;

-- 12.	Get student details in descending order of namelast.
select * from student order by namefirst desc ;

-- 13.	Get (studentid, namefirst, namelast, dob, and emailID) for all students whose length of email id is more than 20 characters.
select id , namefirst , namelast , dob , emailID from student where length(emailID)> 20;

-- 14.	Combine to display student namefirst and namelast.
select namefirst , namelast , concat(namefirst,namelast) as name from student;

-- 15.	Write a query to display the following output for all student. If (namefirst, namelastoremailID) is null then replace it with a blank space. 
-- eg. (Bhoopali Nanadikar and emailIDis bhoopali.nanadikar@gmail.com)
select concat(namefirst," ",namelast)," and emailId is ",ifnull(emailID," "),ifnull(emailID," ",ifnull(namelast," ")) R1 from student;

-- 16.	Get student namefirst and namelast in upper case.
select namefirst,namelast,upper(namefirst) R1,upper(namelast)R2 from student;

-- 17.	Get student firstName and lastname in lower case.
select namefirst,namelast,lower(namefirst) R1,lower(namelast)R2 from student;

-- 18.	Get student firstName and lastname in reverse order.
select namefirst,namelast,reverse(namefirst)R1,reverse(namelast) R2 from student;

-- 19.	Get first 4 letters of student namefirst.
select namefirst ,left(namefirst,4) R1 from student;

-- 20.	Get second letter of student namefirst to second last letter of student namefirst.
select namefirst,concat(substr(namefirst,2,1),substr(namefirst,-2,1)) R1 from student

-- 21.	Get ASCII character of student namefirst.
select namefirst, ascii(namefirst) from student;

-- 22.	Get first 5 letter of the students’ namefirst.
select namefirst,left(namefirst,5) from student;

-- 23.	Print phone number of all student in the given format 7032300034*****.
select number ,concat(number,"*****") R1 from student_phone;

-- 24.	Get all students whose DOB is in the month of ‘October’.
select *,date_format(DOB,'%M') R1 from student where date_format(DOB,'%M')='october';

-- 25.	Get all students whose DOB is in the month of ‘January’ or ‘December’.
select * ,date_format(DOB,'%M') R1 from student where date_format(DOB,'%m') in (1,12);

-- 26.	Get all faculty who were born on ‘Sunday’
select *, date_format(DOB,'%w') R1 from faculty where date_format(DOB,'%w') ='Sunday';

-- 27.	Print current date and time.
select now();

-- 28.	Extract month from the current date.
Select extract(month from now());

-- 29.	Extract year from the current date.
Select extract(year from now());

-- 30.	Get all students whose DOB is in the year 1984 in ascending order of namefirst.
select * from student where year(DOB)=1984 order by(namefirst);

-- 31.	Get all students whose DOB is in the 4 quarter of a year.
select * from student where quarter(DOB)=4;

-- 32.	Get all students whose DOB is in the 43rd week of a year.
select * from student where week(DOB)=43;

-- 33.	Get all student whose DOB is in between 10 and 19 day.
select * from student where day(DOB) between 10 and 19;

-- 34.	Generate the random number between 1 to 100.
select floor(1 + rand() * 100);

-- 35.	Display the 5 character of namefirst column from student table.
select namefirst ,left(namefirst,5) R1 from student;table 

-- 36.	Display all student in ascending order of their DOB, the ordering must be done on weekday name starting form
-- First Time: ‘Monday’, ‘Tuesday’…… ‘Sunday’
-- Second Time:  ‘Friday’, ‘Saturday’ …… ‘Thursday’
-- Third Time: ‘Wednesday’, ‘Thursday’…… ‘Tuesday’
select * from student order by field(dayname(dob),'Monday','Tuesday','Wednesday','thuresday','Friday','saturday');

-- 37.	Display all student who’s DOB comes in the 4th quarter of the year.
select * from student where quarter(DOB)=4;

-- 38.	Display all students who were born on ‘Sunday’.
select * from student where dayofweek(dob) = 'Sunday';

-- 39.	Display the DOB in the give format ‘12th of June 1984’
select DOB,concat(day(dob) ,'th of ',date_format(DOB,'%M' '%Y')) R1 from student;

-- 40.	Display all course_batches who ends on ‘Sunday’.
select * from course_batches where dayname(endson) = 'sunday';

-- 41.	Display student_phone number in the following format “7032******” for all students.
select number , concat(left(number,4),'******') R1 from student_phone;

-- 42.	Display student_phone number in the following format “7032**8765” for all students.
select number ,concat(left(number,4),'**',right(number,4)) Format from student_phone;

-- 43.	Display nameFirst and count how many ‘A’ char in appearing in their names.
select namefirst,length(namefirst)- length(replace(lower(namefirst),'a',"")) count from student;



