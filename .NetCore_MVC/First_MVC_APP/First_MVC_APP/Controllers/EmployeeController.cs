using First_MVC_APP.Models;
using Microsoft.AspNetCore.Mvc;

namespace First_MVC_APP.Controllers
{
    public class EmployeeController : Controller
    {
       
        public IActionResult Index()
        {
            return File("~/js/site.js", "text/javascript");
        }

        private readonly List<EmployeeController> _employeeControllers;
        private List<Employee> _employees;

        public EmployeeController()
        {
            _employees = new List<Employee>()
            {
                new Employee() {EmployeeId = 1,Employee_Name ="Siddharth", Employee_Department = "SDE 1", Employee_Age = 23 , Employee_Salary = 550000},
                new Employee() {EmployeeId = 2,Employee_Name ="Sagar", Employee_Department = "SDE 2", Employee_Age = 22 , Employee_Salary = 1000000},
                new Employee() {EmployeeId = 3,Employee_Name ="Swayam", Employee_Department = "Tester", Employee_Age = 24 , Employee_Salary = 1500000},
                new Employee() {EmployeeId = 3,Employee_Name ="Ishwar", Employee_Department = "Devloper", Employee_Age = 24 , Employee_Salary = 1200000},
            };
        }

        public IActionResult Data()
        {
            return Json(_employees);
        }
        //Customers/Rules
        public IActionResult Card()
        {
            return View(_employees);
        }
        public IActionResult List()
        {
            return View(_employees);
        }
    }
}
