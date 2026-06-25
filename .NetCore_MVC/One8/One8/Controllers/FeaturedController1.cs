using Microsoft.AspNetCore.Mvc;

namespace One8.Controllers
{
    public class FeaturedController1 : Controller
    {
        public IActionResult Index()
        {
            return View();
        }
    }
}