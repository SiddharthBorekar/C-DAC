// Similar Question (Using < Operator)
// Write a C++ program to demonstrate runtime polymorphism and operator overloading.
// Create a base class Animal containing data members name and age.
// Provide default and parameterized constructors and a virtual function talk().
// Derive two classes Dog and Cat from Animal.
// Override the talk() function in both derived classes.
// In class Cat, overload the < operator to compare the names of two Cat objects using strcmp().
// The operator should return true if the name of the first cat comes alphabetically before the second cat.
// In main():
// Create a Dog object using a base class pointer and call talk() (demonstrating runtime polymorphism).
// Create two Cat objects.
// Compare their names using the overloaded < operator and display the result.

# include<iostream>
using namespace std;
class Animal{
    private:
    int name ;
    int age ;
    public:
    Animal()
    {
        name = 0;
        age = 0;
        cout<<"default constructure of animal";
    }
    Animal(int n ,int a)
    {
        cout<<"paramater constructure of animal";
    }
    ~Animal()
    {
        cout<<"paramater constructure of animal";
    }
    virtual void display()
    {
        cout<<"paramater constructure of animal";
    }
    virtual void talk() = 0;
};
class Dog : public Animal{
Dog()
    {
        cout<<"default constructure of Dog";
    }
    Dog(int n ,int a) : Animal(n,a)
    {
        cout<<"paramater constructure of Dog";
    }
    ~Dog()
    {
        cout<<"paramater constructure of animal";
    }
    void display() override
    {
        cout<<"paramater constructure of animal";
    }
    void talk() override
    {
        
    }
};
int main(){

    return 0;
}