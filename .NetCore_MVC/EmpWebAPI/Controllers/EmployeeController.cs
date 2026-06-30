using EmpWebAPI.Models;
using Microsoft.AspNetCore.Http;
using Microsoft.AspNetCore.Mvc;

namespace EmpWebAPI.Controllers
{
    [Route("api/[controller]")]
    [ApiController]
    public class EmployeeController : ControllerBase
    {
        private readonly List<Employee> _employees;

        public EmployeeController()
        {
            _employees = new List<Employee>
            {
                new Employee { Id = 1, Name = "John Doe", Location = "New York" },
                new Employee { Id = 2, Name = "Jane Smith", Location = "Los Angeles" },
                new Employee { Id = 3, Name = "Mike Johnson", Location = "Chicago" },
                new Employee { Id = 4, Name = "Mike Lumsum", Location = "Chicago" },
            };
        }

        [ProducesResponseType(StatusCodes.Status200OK)]
        [ProducesResponseType(StatusCodes.Status204NoContent)]
        [HttpGet]
        public ActionResult<List<Employee>> Get()
        {
            if (_employees.Count > 0)
            {
                return Ok(_employees);
            }
            else
            {
                return NoContent();
            }
        }

        [ProducesResponseType(StatusCodes.Status200OK)]
        [ProducesResponseType(StatusCodes.Status204NoContent)]
        [HttpGet("{id:int}")]
        public ActionResult<Employee> Get(int id)
        {
            if (_employees.Count > 0)
            {
                return Ok(_employees.Find(e=> e.Id == id));
            }
            else
            {
                return NoContent();
            }
        }

        [ProducesResponseType(StatusCodes.Status200OK)]
        [ProducesResponseType(StatusCodes.Status204NoContent)]
        [HttpGet("{loc:alpha:minlength(4)}")]
        public ActionResult<IEnumerable<Employee>> Get(string loc)
        {
            var empLoc = _employees.Where(e=> e.Location.ToLower().Contains(loc.ToLower())).ToList();
            if (empLoc.Count > 0)
            {
                return Ok(empLoc);
            }
            else
            {
                return NoContent();
            }
        }

    }
}
