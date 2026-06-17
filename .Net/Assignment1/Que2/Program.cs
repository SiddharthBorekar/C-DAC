//Write a program to accept 5 marks from the user and calculate their average using Console Application.


namespace Que2
{
    internal class Program
    {
        static void Main(string[] args)
        {
            try
            {
                Console.WriteLine("Enter 5 Subject Marks :");

                Console.WriteLine("Enter 1st Marks :");
                int m1 = Convert.ToInt32(Console.ReadLine());
                Console.WriteLine("Enter 2st Marks :");
                int m2 = Convert.ToInt32(Console.ReadLine());
                Console.WriteLine("Enter 3st Marks :");
                int m3 = Convert.ToInt32(Console.ReadLine());
                Console.WriteLine("Enter 4st Marks :");
                int m4 = Convert.ToInt32(Console.ReadLine());
                Console.WriteLine("Enter 5st Marks :");
                int m5 = Convert.ToInt32(Console.ReadLine());

                int avg = m1 + m2 + m3 + m4 + m5 / 5;
                Console.WriteLine("Average Marks of subject is :" + avg);
            }
            catch (FormatException fe)
            {
                Console.WriteLine(fe);
                throw;
            }

        }
    }
}