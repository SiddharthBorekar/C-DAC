using System.ComponentModel.DataAnnotations;

namespace EFcoreDemo.Model;
    public class Department
    {
        [Key]
        public int DepartID { get; set; }
        [Required]
        [StringLength(100)]
        public string DeptName { get; set; } = string.Empty;
        public string DeptPeople { get; set; } = string.Empty;

        public ICollection<Employee>? Employees { get; set; }

    }