//Write a program to accept an Employee no. And department no. As numeric data and designation code as character data. Display the entered data with proper messages as below and refer the below table for entered data – 

namespace Que12
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Enter Employee Number :");
            int Empno = Convert.ToInt32(Console.ReadLine());
            Console.WriteLine("Enter Deparment Number :");
            int Dpartno = Convert.ToInt32(Console.ReadLine());
            Console.WriteLine("Enter designation Code :");
            char Degcode = Convert.ToChar(Console.ReadLine());

            if(Dpartno == 10 && Degcode == 'M')
            {
                Console.WriteLine("Deparment Number :"+ Dpartno + "Department Name : Purchase Designation Code :"+ Degcode + "Designation : Manager");
            }
            else if(Dpartno == 20 && Degcode == 'S')
            {
                Console.WriteLine("Deparment Number :" + Dpartno + "Department Name : Sales Designation Code :" + Degcode + "Designation : Supervisor");

            }
            else if(Dpartno == 30 && Degcode == 'A')
            {
                Console.WriteLine("Deparment Number :" + Dpartno + "Department Name : Production Designation Code :" + Degcode + "Designation : Analyst");

            }
            else if(Dpartno == 40 && Degcode == 's')
            {
                Console.WriteLine("Deparment Number :" + Dpartno + "Department Name : Marketing Designation Code :" + Degcode + "Designation : Sales Person");

            }
            else if(Dpartno == 50 && Degcode == 'a')
            {
                Console.WriteLine("Deparment Number :" + Dpartno + "Department Name : Accounts Designation Code :" + Degcode + "Designation : Accountant");
            }
             else
            {
                Console.WriteLine("Enter Proper details");
            }
        }
    }
}
