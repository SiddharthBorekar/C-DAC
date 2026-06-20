namespace Ques1
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Dictionary<int, Employee> employess = GetAllEmployee();
            foreach (var item in employess)
            {
                Console.WriteLine($"Key: {item.Key}");
                Console.WriteLine($"Id: {item.Value.Id}");
                Console.WriteLine($"Name: {item.Value.Name}");
                Console.WriteLine($"Salary: {item.Value.Age}");
                Console.WriteLine($"Salary: {item.Value.Salary}");
                Console.WriteLine();
            }
        }

        private static Dictionary<int, Employee> GetAllEmployee()
        {
            return new Dictionary<int, Employee>{
                { 1 , new Employee { Id = 1259, Age = 23, Name = "rohit", Salary = 55956.5D }},
                { 2 , new Employee { Id = 1260, Age = 24, Name = "sahil", Salary = 89555.6D }},
                { 3 , new Employee { Id = 1261, Age = 23, Name = "sakshi", Salary = 78225.5D }}
            };
        }
    }
}