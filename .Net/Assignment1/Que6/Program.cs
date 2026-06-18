//Accept a character from a user and print its ASCII value using Console Application.

namespace Que6
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Enter a Character :");
            char C = Convert.ToChar(Console.Read());

            Console.WriteLine(Convert.ToInt32(C));
        }
    }
}