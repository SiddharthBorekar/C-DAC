#include <iostream>
#include <cstring>
using namespace std;

class student{
protected:
    int student_id;
    char *name;
    int age;
    float Theory_marks;

public:
    student()
    {
        cout<<"\nDefault constructor of student :";
    }
    student(int s,const char *n,int a,float tm)
    {
        student_id = s;
        name = new char[strlen(n)+1];
        strcpy(name,n);
        age = a;
        Theory_marks = tm;

        cout<<"\nParameter constructor of student :";
    }

    virtual ~student()
    {
        delete[] name;
        cout<<"\nDestructor of student :";
    }

    virtual void display()
    {
        cout<<"\nFunction of student";
    }

    virtual void conductExam() = 0;
    virtual float calTotal() = 0;
};
class sportStudent : public student{
protected:
    char *sportName;
    int creadits;
public:
    sportStudent(int s,const char *n,int a,float tm,const char *sn,int c): student(s,n,a,tm)
    {
        sportName = new char[strlen(sn)+1];
        strcpy(sportName,sn);
        creadits = c;

        cout<<"\nParameter constructor of sportStudent :";
    }
    ~sportStudent()
    {
        delete[] sportName;
        cout<<"\nDestructor of sportStudent :";
    }
    void conductExam() override
    {
        cout<<"\nTheory Exam and physical activity needs to be done";
    }
    float calTotal() override
    {
       return Theory_marks + (creadits * 10);
    }
    void display()     
    {
        cout<<"\nFunction of SportStudent";
        cout<<"\nTotal Marks = "<<calTotal()<<endl;
    }
};
class ScienceStudent : public student{
protected:
    char *sp_subject;
    float PracticalMarks;
public:
    ScienceStudent(int s,const char *n,int a,float tm,const char *sp,float pm) : student(s,n,a,tm)
    {
        sp_subject = new char[strlen(sp)+1];
        strcpy(sp_subject,sp);
        PracticalMarks = pm;
        cout<<"\nParameter constructor of ScienceStudent :";
    }
    ~ScienceStudent()
    {
        delete[] sp_subject;
        cout<<"\nDestructor of ScienceStudent :";
    }
    void conductExam()
    {
        cout<<"\nTheory Exam and Practical exams are conducted";
    }
    float calTotal()
    {
       return PracticalMarks + Theory_marks ;
    }
    void display()
    {
        cout<<"\nTotal Marks = "<<calTotal()<<endl;
        cout<<"\nFunction of ScienceStudent";
    }
};
int main()
{
    student *ptr = new sportStudent(101,"aditya",20,50,"Cricket",10);
    ptr->display();
    delete ptr;

    student *ptr1 = new ScienceStudent(102,"Swayam",20,20,"Maths",200);
    ptr1-> display();
    delete ptr1;
    return 0;
}
