# include <iostream>
# include <cstring>
using namespace std;
class student {
    protected:
    int studentID;
    char * name;
    int age;
    float Theory_marks;
    public:
    student(){
        cout<<"Default constructor of student:";
    }
    student(int s,const char *n,int a,float tm)
    {
        name = new char [strlen(n)+1];
        strcpy(name,n);
        studentID = s;
        age = a;
        Theory_marks = tm;
        cout<<"Parameterize constructor of student";
    }
    ~student()
    {
        delete[] name;
        cout<<"distructor of student";
    }
    virtual void display()
    {
        cout<<"This is a student class";
    }
    virtual void conductexam() = 0;
    virtual float calTotal() = 0;
};
class sportstudent : public student{
    protected:
    char *sportname;
    int creadits;
    public:
    sportstudent(){
        cout<<"\nDefault constructor of sportstudent:";
    }
    sportstudent(int s,const char *n,int a,float tm, const char *sn, int c) : student(s,n,a,tm)
    {
        sportname = new char[strlen(sn)+1];
        strcpy(sportname,sn);
        creadits = c;
        cout<<"\nParameterize constructor of sportstudent";
    }
    ~sportstudent()
    {
        delete[] sportname;
        cout<<"\ndistructor of sportstudent";
    }
    void display() override
    {
        cout<<"\nThis is a display function of sportstudent class";
        cout<<"\ntotal"<<calTotal()<<endl;
    }
    void conductexam() override
    {
        cout<<"\nTheory Exam and physical activity needs to be done";
    }
    float calTotal () override
    {
        return Theory_marks + (creadits * 10);
    }
};
int main()
{
    student *ptr = new sportstudent(101,"aditya",20,50,"Cricket",10);
    ptr -> display();
    delete ptr;
    return 0;
}