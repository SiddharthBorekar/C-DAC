using Microsoft.AspNetCore.Mvc;

namespace First_MVC_APP.Models
{
    public class Employee : Controller
    {
        internal string name;
        internal int bounty;

        public int EmployeeId { get; set; }
        public String Employee_Name {  get; set; }
        public string Employee_Department { get; set; }
        public int Employee_Age { get; set; }
        public double Employee_Salary { get; set; }
    }
}
