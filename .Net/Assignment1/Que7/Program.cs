//Write a program to calculate Net Salary of an employee using Basic Salary based on following parameters – 
//HRA is 20 % of basic salary.
//DA is 40 % of basic salary.
//PF is 10 % of Gross salary.
//Gross Salary is Basic Salary + HRA + DA.
//Net salary is Gross Salary – PF.

namespace Que7
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Enter A Basic Salary :");
            double BSal = Convert.ToDouble(Console.ReadLine());

            double HRA = 0.20 * BSal;
            Console.WriteLine(HRA);

            double DA = 0.40 * BSal;
            Console.WriteLine(DA);

            double GrossSal = BSal + HRA + DA;
            Console.WriteLine("Gross Salary :" + GrossSal);

            double PF = 0.10 * GrossSal;
            Console.WriteLine(PF);
            
            double NetSal = GrossSal - PF;
            Console.WriteLine("Net Salary :"+NetSal);
        }
    }
}
