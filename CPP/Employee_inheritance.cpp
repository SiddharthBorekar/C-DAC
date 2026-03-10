# include <iostream>
using namespace std;

class employee{
    protected:
    string ename;
    int eno;
    float sal;
    public:
    employee(){
        cout<<"\nDefault construct of employee ";
    }
    employee(int eno,string emane,float sal){
        cout<<"\nParameterize construct of employee ";
    }
    ~employee(){
        cout<<"\nDefault Distructor of employee";
    }
    void calsal(){
        cout<<"\n calsal of employee :";
    }
};
class manager : public employee{
    public:
    manager(){
        cout<<"\nDefault construct of manager ";
    }
    manager(int n){
        cout<<"\nParameterize construct of manager ";
    }
    ~manager(){
        cout<<"\nDefault Distructor of manager";
    }
    void calsal(){
        cout<<"\n Allowence of manager :";
    }
};
class HR : public manager{
    public:
    HR(){
        cout<<"\nDefault construct of HR ";
    }
    HR(int n){
        cout<<"\nParameterize construct of HR ";
    }
    ~ HR(){
        cout<<"\nDefault Distructor of HR";
    }
    void calsal(){
        cout<<"\n Allowence of HR :";
    }
};
class account : public manager{
    account(){
        cout<<"\nDefault construct of HR ";
    }
    account(int n){
        cout<<"\nParameterize construct of HR ";
    }
    ~account(){
        cout<<"\nDefault Distructor of HR";
    }
    void calsal(){
        cout<<"\n Allowence of account :";
    }
};

class admin : public employee{
    admin(){
        cout<<"\nDefault construct of manager ";
    }
    admin(int n){
        cout<<"\nParameterize construct of manager ";
    }
    ~admin(){
        cout<<"\nDefault Distructor of manager";
    }
    void calsal(){
        cout<<"\n Allowence of manager :";
    }
};