using First_MVC_APP.Models;
using Microsoft.AspNetCore.Mvc;

namespace First_MVC_APP.Controllers
{
    public class SuppliesController : Controller
    {
        public IActionResult Index()
        {
            return File("~/js/site.js", "text/javascript");
        }

        private readonly List<SuppliesController> _suppliesControllers;
        private List<Employee> _supplies;

        public SuppliesController()
        {
            _supplies = new List<Employee>()
            {
                new Employee() { name = "Zoro", bounty = 250000 },
                new Employee() { name = "Lufi", bounty = 450000 },
            };
        }

            public IActionResult Data()
        {
            return Json(_supplies);
        }


        public IActionResult List()
        {
            return View(_supplies);
        }
        public IActionResult Card()
        {
            return View(_supplies);
        }
       
    }
}
