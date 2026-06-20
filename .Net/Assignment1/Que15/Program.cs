//Write a program to display ASCII characters in the range (0-255). Pause after displaying every 10 characters.

namespace Que15
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int count = 0;
            for (int i = 0; i < 255; i++)
            {
                count++;
                if (count == 10)
                {
                    Console.WriteLine();
                    count = 0;
                }
                Console.WriteLine(Convert.ToChar(i));
            }
        }
    }
}
