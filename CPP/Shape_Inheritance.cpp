#include <iostream>
using namespace std;

class shape
{
public:
    shape()
    {
        cout << "\nDefault construct of shape ";
    }
    virtual ~shape()
    {
        cout << "\nDefault Distructor of shape";
    }
    virtual void Area()
    {
        cout << "\nShape of function :";
    }
};
class Circle : public shape
{
protected:
    int r;

public:
    Circle()
    {
        cout << "\nDefault construct of Circle ";
    }
    Circle(int n)
    {
        cout << "\nParameterize construct of circle ";
        r = n;
    }
    ~Circle()
    {
        cout << "\nDefault Distructor of Circle";
    }
    void Area()
    {
        int area;
        area = 3.14 * (r * r);
        cout << "\nArea of circle :" << area;
    }
};
class square : public shape
{
protected:
    int s;

public:
    square()
    {
        cout << "\nDefault construct of square ";
    }
    square(int m)
    {
        cout << "\nParameterize construct of square ";
        s = m;
    }
    ~square()
    {
        cout << "\nDefault Distructor of square";
    }
    void Area()
    {
        int square;
        square = (s * s);
        cout << "\nArea of square :" << square;
    }
};

int main()
{
    shape *ptr = new Circle(5);
    ptr->Area();
    delete ptr;

    shape *ptr1 = new square(6);
    ptr1->Area();
    delete ptr1;
    return 0;
}