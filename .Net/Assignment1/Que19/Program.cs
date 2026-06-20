//  Write a function Prime() which checks the user entered number passed to it 
//  is a prime number or not.In this function call another function called Check() 
//  which returns the status of the number whether it is positive or negative and pass 
//  it to main function.If the number is negative, ask user to re-enter the number or else print the positive number.

namespace Que19
{
    internal class Program
    {

        static void Main(string[] args)
        {
            int num = 0;
            do
            {
                try
                {
                    Console.WriteLine("Enter a Number: ");
                    num = Convert.ToInt32(Console.ReadLine());
                }
                catch (FormatException e)
                {
                    Console.WriteLine(e.Message);
                }
                catch (Exception e)
                {
                    Console.WriteLine(e.Message);
                }
            } while (!isPrime(num));
        }

        static bool isPrime(int num)
        {
            if (Check(num))
            {
                int count = 0;
                for (int i = 1; i <= num / 2; i++)
                {
                    if (num % i == 0)
                    {
                        count++;
                    }
                }
                if (count > 1)
                {
                    Console.WriteLine($"{num} Number is Not a Prime Number");
                    return false;
                }
                else
                {
                    Console.WriteLine($"{num} Number is a Prime Number and A Positive Number");
                    return true;
                }
            }
            Console.WriteLine($"{num} Number is a Negative Number Re-Enter: ");
            return false;
        }

        static bool Check(int num)
        {
            if (num >= 0)
            {
                return true;
            }
            else
            {
                return false;
            }
        }
    }
}