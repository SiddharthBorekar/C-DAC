-- 1. Display all student and with their address from student and student_address tables.
select s.* , sa.* from student s join student_address sa on s.id = sa.studentID;

-- 2. Display (namefirst, namelast, emailID, and student_qualification details) from student and student_qualification relations.
select s.namefirst,namelast,emailid , sq.* from student s join student_qualifications sq on s.id = sq.studentid;

-- 3. Display (namefirst, namelast, emailID, college, and university) who have studied in 'Yale University'. (Use student, and student_qualification relation)
select s.namefirst,namelast,emailid ,sq.college,university from student s join student_qualifications sq on s.id = sq.studentid where university = "Yale University";

-- 4. Display all student details his phone details and his qualification details. (Use student, student_phone and student_qualification relation)
 select s.* ,sp.* , sq.* from student s join student_phone sp join student_qualifications sq on s.id = sp.studentid = sq.studentid;


-- 5.Display (studentID, namefirst, namelast, name, college, university, and marks) whose name is ‘BE’.(Use student, and student_qualification relation)
select s.ID,namefirst,namelast,name,college,university from student s join student_qualifications sq on s.id = sq.studentid;

-- 6. Display the module name and the duration of the module for the batch “Batch1”.

-- 7. Display student information along with his batch details who have joined in “Batch1”.
