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
        private readonly List<Supplies> _supplies;

        public SuppliesController()
        {
            _supplies = new List<Supplies>()
            {
                new Supplies() {name = "Zoro", bounty = 250000},
                new Supplies() {name = "Luffy", bounty = 450000 },
            };
        }

            public IActionResult Data()
        {
            return Json(_supplies);
        }


        public IActionResult Card()
        {
            return View(_supplies);
        }
        public IActionResult List()
        {
            return View(_supplies);
        }   
    }
}
