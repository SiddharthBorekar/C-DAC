using Microsoft.AspNetCore.Mvc;

namespace First_MVC_APP.Models
{
    public class Employee : Controller
    {
 

        public int EmployeeId { get; set; }
        public string Employee_Name { get; set; } = string.Empty;
        public string Employee_Department { get; set; } = string.Empty;
        public int Employee_Age { get; set; }
        public double Employee_Salary { get; set; }

        public string ImageUrl { get; set; }
    }
}
