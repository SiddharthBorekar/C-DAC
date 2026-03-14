# include <iostream>
# include <cstring>
using namespace std;

class Animal{
    protected:
    string name;
    int age;
    public:
    Animal()
    {
        name = "NA";
        age = 0;
    }
    Animal(string n,int a)
    {
        name = n;
        age = a;
    }
    ~Animal()
    {
        cout<<"\nThis is a distructor of Animal";
    }
    virtual void talk()
    {
        cout<<"\nThis is a talk function";
    }
};
class Dog : public Animal{
    public:
    Dog()
    {
        cout<<"\ndefault constructor of Dog";
    }
    Dog(string n,int a) : Animal(n,a)
    {
        cout<<"\nParameterized constructor of Dog";
    }
    ~Dog()
    {
        cout<<"\nThis is distructor of Dog";
    }
    void talk() override
    {
        cout<<"\nBark Bark....";
    }
};
class Cat : public Animal{
    public:
    Cat()
    {
        cout<<"\ndefault constructor of Cat";
    }
    Cat(string n,int a) : Animal(n,a)
    {
        cout<<"\nParameterized constructor of Cat";
    }
    ~Cat()
    {
        cout<<"\nThis is distructor of Cat";
    }
    void talk() override
    {
        cout<<"\nMeow meow ....";
    }
    bool operator == (Cat &c)
    {
        if(strcmp(name.c_str(),c.name.c_str()) == 0)
        {
            return true;
        }else {
            return false;
        }
    }
};
int main()
{
Animal *animal = new Animal();  //This line should give compile time error "Cant create object of abstract class"

// My Dog name is Boss & age is 15 months
    Animal *dogPtr = new Dog("Boss", 15);
    dogPtr->talk(); // Every animal has unique way of sound
    delete dogPtr;

// My cat name is Puppy & she is 3 month old and it is-a Animal
    Cat c1("Puppy", 3);
    Cat c2("Sweety", 4);
    Cat c3("Puppy", 3);

    // Use strcmp function to to compare names of 2 Cat
     if(c1 == c3)
     cout<<"\nBoth are same!"<<endl;
     else
     cout<<"\nBoth are different!"<<endl;
    c1.talk();
return 0;
}