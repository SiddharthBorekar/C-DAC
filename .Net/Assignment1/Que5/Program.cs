//Write a program to swap two variables using a third variable by Console Application.

namespace Que5
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int a = 1;
            int b = 2;

            Console.WriteLine("Before Swaping :" + a);
            Console.WriteLine("Before Swaping :" + b);

            int temp = a;
            a = b;
            b = temp;

            Console.WriteLine("After Swaping :" +a);
            Console.WriteLine("After Swaping :" +b);

        }
    }
}
