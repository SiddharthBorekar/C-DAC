# include <iostream>
using namespace std;

class employee{
    protected:
        string ename;
        int empno;
        float sal;
    public:
        employee()
        {
            cout<<"\nDefault construct of employee";
        }
        employee(string en,int em,float s)
        {
            ename = en;
            empno = em;
            sal = s;
            cout<<"\nParameterize construct of employee ";
        }
        ~employee()
        {
            cout<<"\nDefault Distructor of employee";
        }
        virtual float calSal()
        {
            cout<<"\n calsal of employee :";
        }
        virtual void display()
        {
            cout<<"Display of eplooyee:";
        }
};
class manager : public employee
{
    protected:
        int allowence;
    public:
        manager()
        {
            allowence = 0;
            cout<<"\nDefault construct of manager ";
        }
        manager(string en,int em,float s,int a) : employee(en,em,s){
            cout<<"\nParameterize construct of manager ";
            allowence = a;
        }
        ~manager(){
            cout<<"\nDefault Distructor of manager";
        }
        void calsal(){
            sal = sal + allowence;
            cout<<"\n Allowence of manager :";
            cout<<sal;
        }
};
class HR : public manager{
    protected:
    int target;
    public:
    HR(){
        target = 0;
        cout<<"\nDefault construct of HR ";
    }
    HR(string en,int em,float s,int a,int t) : manager(en,em,s,a)
    {
        cout<<"\nParameterize construct of HR ";
        target = t;
    }
    ~ HR(){
        cout<<"\nDefault Distructor of HR";
    }
    virtual float calsal(){
        cout<<"\n Allowence of HR :";
    }
};
class account : public manager{
    protected:
    int overtime;
    public:
    account(){
        overtime = 0;
        cout<<"\nDefault construct of HR ";
    }
    account(string en,int em,float s,int a,int t,int o) : manager(en,em,s,a)
    {
        cout<<"\nParameterize construct of HR ";
        overtime = o;
    }
    ~account(){
        cout<<"\nDefault Distructor of HR";
    }
    virtual float calsal(){
        cout<<"\n Allowence of account :";
    }
};
class admin : public employee{
    protected:
    int basicsal;
    public:
    admin(){
        cout<<"\nDefault construct of manager ";
        basicsal = 0;
    }
    admin(string en,int em,float s,int b) : employee(en,em,s){
        cout<<"\nParameterize construct of manager ";
        basicsal = b;
    }
    ~admin(){
        cout<<"\nDefault Distructor of manager";
    }
    void calsal(){
        cout<<"\n Allowence of manager :";
    }
};
class officer : public admin{
    protected:
    int add_alloence;
    public:
    officer(){
        add_alloence = 0;
        cout<<"\nDefault construct of officer ";
    }
    officer(string en,int em,float s,int b,int add) : admin(en,em,s,b)
    {
        cout<<"\nParameterize construct of officer ";
        add_alloence = add;
    }
    ~officer(){
        cout<<"\nDefault Distructor of officer";
    }
    void calsal(){
        cout<<"\n Allowence of officer :";
    }
};
class Lab : public admin{
    protected:
    int incentive;
    int hours;
    Lab(){
        cout<<"\nDefault construct of Lab ";
        incentive = 0;
        hours = 0;
    }
    Lab(string en,int em,float s,int b,int in,int hr) : admin(en,em,s,b)
    {
        cout<<"\nParameterize construct of Lab ";
        incentive = in;
        hours = hr;
    }
    ~Lab(){
        cout<<"\nDefault Distructor of Lab";
    }
    void calsal(){
        cout<<"\n Allowence of Lab :";
    }
};
class cleark : public employee{
    protected:
    int overtime ;
    public:
    cleark(){
        overtime = 0;
        cout<<"\nDefault construct of cleark ";
    }
    cleark(string en,int em,float s,int a,int ot) : employee(en,em,s){
        cout<<"\nParameterize construct of cleark ";
        overtime = ot;
    }
    ~cleark(){
        cout<<"\nDefault Distructor of cleark";
    }
    void calsal(){
        cout<<"\n Allowence of manager :";
    }
};
class security : public employee{
    public:
    security(){
        cout<<"\nDefault construct of security ";
    }
    security(string en,int em,float s,int a) : employee(en,em,s){
        cout<<"\nParameterize construct of security ";
    }
    ~security(){
        cout<<"\nDefault Distructor of security";
    }
    void calsal(){
        cout<<"\n Allowence of manager :";
    }
};
int main(){
    employee *ptr = new manager("Siddharth",45,85.15,60);
    ptr -> display();
    delete ptr;
    return 0;
}