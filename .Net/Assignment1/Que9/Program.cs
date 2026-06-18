namespace Que9
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Enter Basic Salary :");
            double Bsal = Convert.ToDouble(Console.ReadLine());
            Console.WriteLine("Enter Total Sales :");
            double Tsell = Convert.ToDouble(Console.ReadLine());

            if(Tsell >= 5000 && Tsell <= 7500)
            {
                double Commision = Tsell * 0.03;
                Console.WriteLine(Commision);
            }

            if (Tsell >= 7501 && Tsell <= 10500)
            {
                double Commision = Tsell * 0.08;
                Console.WriteLine(Commision);
            }

            if (Tsell >= 10501 && Tsell <= 15000)
            {
                double Commision = Tsell * 0.11;
                Console.WriteLine(Commision);
            }

            if (Tsell > 15000)
            {
                double Commision = Tsell * 0.15;
                Console.WriteLine(Commision);
            }


        }
    }
}
