//Write a program to find LEAP year by using – 
//If – Else and logical operators.
//Conditional operator.
//Note – A Leap year is divisible by 4 and is not divisible by 100 but it could be divisible by 400.

namespace Que8
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Enter A Year :");
            int year = Convert.ToInt32 (Console.ReadLine());

            if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
            {
                Console.WriteLine("Its A Leap year :");
            }
            else
            {
                Console.WriteLine("Its not a Leap Year");
            }
            
        }
    }
}
