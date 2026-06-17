//Write a program to accept 5 marks from the user and calculate their sum using Console Application.

namespace Que3
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Enter 5 Marks:");
            int m1 = Convert.ToInt32(Console.ReadLine());
            Console.ReadLine();
            int m2 = Convert.ToInt32(Console.ReadLine());
            Console.ReadLine();
            int m3 = Convert.ToInt32(Console.ReadLine());
            Console.ReadLine();
            int m4 = Convert.ToInt32(Console.ReadLine());
            Console.ReadLine();
            int m5 = Convert.ToInt32(Console.ReadLine());
            Console.ReadLine();

            double sum = m1 + m2 + m3 + m4;
            Console.WriteLine("Sum of 5 marks :"+ sum);
        }
    }
}
