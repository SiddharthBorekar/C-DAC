-- 1.  Count total number of students.
 select count(*) from student;
 
-- 2.  Count total number of students who are born in 1986.
select count(*) from student where year(dob) = 1986;

-- 3. Count total number of students whose namefirst starts with the letter ‘B’.
 select count(*) from student where namefirst like "B%";
 
-- 4. count total number student who were born in ‘July.
select count(*) from student where month(dob) = 7;

-- 5. Display studentID and count the student who are having more than two phones.

-- 6. Count unique universities from student_qualifications table.

-- 7. Display the university name and the count of those students who have done ‘BE’

-- 8. Count how many students has done ‘BE’.

-- 9. Count how many students has not done ‘BE’.

-- 10. Find the maximum marks student got in ‘BE’.


