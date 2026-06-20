//Write a program to display whether a user entered number is a prime or no.Modify the same program to display 
//first 25 prime numbers using while loop.Also write a same program using for and do -while loops.

namespace Ques16
{
    internal class Program
    {
        static void Main(string[] args)
        {
            

            //try
            //{
            //    Console.WriteLine("Enter a Number: ");
            //    int num = Convert.ToInt32(Console.ReadLine());
            //    int count = 0;
            //    for (int i = 1; i <= num / 2; i++)
            //    {
            //        if (num % i == 0)
            //        {
            //            count++;
            //        }
            //    }
            //    if (count > 1)
            //    {
            //        Console.WriteLine($"{num} is not a Prime Number");
            //    }
            //    else
            //    {
            //        Console.WriteLine($"{num} is a Prime Number");
            //    }
            //}
            //catch (FormatException e)
            //{
            //    Console.WriteLine(e.Message);
            //}
            //catch (Exception e)
            //{
            //    Console.WriteLine(e.Message);
            //}

            //int count = 0;
            //int num = 2;
            //while (count < 25)
            //{
            //    bool isPrime = true;
            //    int i = 2;
            //    while (i <= num / 2)
            //    {
            //        if (num % i == 0)
            //        {
            //            isPrime = false;
            //            break;
            //        }
            //        i++;
            //    }
            //    if (isPrime)
            //    {
            //        Console.Write($"{num} ");
            //        count++;
            //    }
            //    num++;
            //}



            int count = 0;
            int num = 2;
            do
            {
                bool isPrime = true;
                int i = 2;
                do
                {
                    if (num > 2 && num % i == 0)
                    {
                        isPrime = false;
                        break;
                    }
                    i++;
                } while (i <= num / 2);

                if (isPrime)
                {
                    Console.Write($"{num} ");
                    count++;
                }
                num++;
            } while (count < 25);
        }
    }
}