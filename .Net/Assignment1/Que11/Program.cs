//Write a program to find maximum of 3 numbers using – 
//If – else.
//Conditional operators.

namespace Que11
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Enter 3 Numbers :");
            int n1 = Convert.ToInt32(Console.ReadLine());
            int n2 = Convert.ToInt32(Console.ReadLine());
            int n3 = Convert.ToInt32(Console.ReadLine());

            if(n1 > n2 && n1 > n3)
            {
                Console.WriteLine("Maximum of 3 is :" + n1);
            }
            if (n2 > n3 && n2 > n1)
            {
                Console.WriteLine("Maximum of 3 is :"+n2);
            }
            if (n3 > n1 && n3 > n2)
            {
                Console.WriteLine("Maximum of 3 is :" + n3);
            }



        }
    }
}
