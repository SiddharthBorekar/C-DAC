-- •	Count total number of students.
select count(*) from student;
-- •	Count total number of students who are born in 1986.
select namefirst,namelast,dob, count(dob) from student where year(dob) = 1986 group by namefirst,namelast,dob ;
-- •	Count total number of students whose namefirst starts with the letter ‘B’.
select ID, count(*) from student where namefirst like '%B' group by id;
-- •	Count total number student who were born in ‘July.
select count(*) from student where month(dob) = 7;
-- •	Display studentID and count the student who are having more than two phones.

-- •	Count unique universities from student_qualifications table.
select count(distinct(university)) from student_qualifications;
-- •	Display the university name and the count of those students who have done ‘BE’
select university,count(*) from student_qualifications where name = 'BE' group by university;
-- •	Count how many students has done ‘BE’.
select count(*) from student_qualifications where name = 'BE';
-- •	Count how many students has not done ‘BE’.
select count(*) from student_qualifications where name != 'BE';
-- •	Find the maximum marks student got in ‘BE’.
select max(marks) from student_qualifications where name = 'BE';
-- •	Find the minimum marks student got in ‘BE’.
select min(marks) from student_qualifications where name = 'BE';
-- •	Count how many course_batches have started on ’2016-02-01’.
select count(*) from course_batches where starton = '2016-02-01';
-- •	Count the number of students who have more than 60% in ‘BE’.
select count(*) from student_qualifications where marks > 60 and name = 'BE';
-- •	Count the number of students who have more than 60% in ‘BE’ and done from ‘Harvard university’.
select count(*) from student_qualifications where marks > 60 and name = 'BE' and university = 'Harvard university';
-- •	Count number of courses.
select count(*) from course;
-- •    Count how many distinct universities from student_qualifications table.
select count(distinct(university)) R1 from student_qualifications;
-- •	Find the maximum marks any student has got in “BE”.
select max(marks) from student_qualifications where name = 'BE';