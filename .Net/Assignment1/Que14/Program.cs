//Write a program to accept a number from user and find its absolute value. Absolute always returns a positive value.
namespace Que14
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Enter A number :");
            int num = Convert.ToInt32(Console.ReadLine());

            if(num < 0)
            {
                int abs = -num;
                Console.WriteLine(abs);
            }
            else
            {
                int abs = num;
                Console.WriteLine(abs);
            }

        }
    }
}
