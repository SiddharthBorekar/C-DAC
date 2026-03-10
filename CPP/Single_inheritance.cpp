#include <iostream>
using namespace std;

class Base{
    protected:
    int i;
    public:
        Base(){
            cout<<"\n Default constructor of base :";
            int i=0;
        }
        Base(int n){
            cout<<"\n paramater constructor of base :";
            i=n;
        }
        ~Base(){
            cout<<"\n Distructior of Base :";
        }
        void display(){
            cout<<"\n i= "<<i;
        }
};
class Derived :public Base{
    protected:
    int j;
    public:
    Derived(){
            cout<<"\n  Default constructor of Derived";
            int j=0;
        }
        Derived(int n,int m ): Base(n){
            cout<<"\n paramater constructor of Derived :";
            j = m;
        }
        ~Derived(){
            cout<<"\n Distructior of Derived ";
        }
        void display(){
            cout<<"\n i= "<<i;
            cout<<"\n j= "<<j;
        }
};
int main(){
    Derived obj(10,20);
    obj.display();
    return 0;
}