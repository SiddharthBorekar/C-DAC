
//Write a program to generate all positive combinations of 1,2,3 using for loop.
namespace Que18
{
    internal class Program
    {
        static void Main(string[] args)
        {

            for (int i = 1; i <= 3; i++)
            {
                for (int j = 1; j <= 3; j++)
                {
                    for (int k = 1; k <= 3; k++)
                    {
                        Console.WriteLine($"{i}{j}{k}");
                    }
                }
            }
        }
    }
}