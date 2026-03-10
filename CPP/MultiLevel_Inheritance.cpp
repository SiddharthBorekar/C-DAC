# include <iostream>
using namespace std;

    class Base{
        protected:
        int i;
        public:
        Base(){
            cout<<"\nDefault Constructor of Base :";
            i = 0;
        }
        Base(int n){
            cout<<"\nParameter Constructor of Base :";
            i = n;
        }
        void display()
		{
			cout<<"\n i = "<<i;
		}
        ~Base(){
            cout<<"\nDistructor of Base class :";
    }
};
    class Derived1 :public Base{
        protected:
        int j;
        public:
        Derived1(){
            cout<<"\nDefault Constructor of Derived1 :";
            j=0;
        }
        Derived1(int n,int m): Base(n)
        {
            cout<<"\nParameter Constructor of Derived1 :";
            j = m;
        }
        ~Derived1(){
            cout<<"\nDistructor of Derived1 class :";
        }
        void Display(){
            cout<<"\n i = "<<i;
            cout<<"\n j = "<<j;
        }
        void fun()
	    {
		cout<<"\n fun is called..";
	    }
    };
    class Derived2 :public Derived1{
        protected:
        int k=0;
        public:
        Derived2(){
            cout<<"\nDefault Constructor of Derived2 :";
            k=0;
        }
        Derived2(int n,int m,int p):Derived1(n,m){
            cout<<"\nParameter Constructor of Derived2 :";
            k=p;
        }
        void Display(){
            cout<<"\n i = "<<i;
            cout<<"\n j = "<<j;
            cout<<"\n k = "<<k;
        }
        ~Derived2(){
            cout<<"\nDistructor of Derived2 class :";
        }
        
    };

    int main(){
        Derived2 obj;
        obj.Display();
        return 0;
    }
