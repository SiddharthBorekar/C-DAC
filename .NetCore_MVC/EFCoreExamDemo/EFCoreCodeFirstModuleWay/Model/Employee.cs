using System.ComponentModel.DataAnnotations;
using System.ComponentModel.DataAnnotations.Schema;

namespace EFCoreCodeFirstModuleWay.Model;

public class Employee
{
    [Key]
    public int empId { get; set; }

    [Required]
    [StringLength(100)]
    public string EmpName { get; set; } = string.Empty;

    [Required]
    [Range(15000, 50000)]
    public decimal Salary { get; set; }

    [EmailAddress]
    [StringLength(100)]
    public string email { get; set; } = string.Empty;

    //foreign key for department
    [ForeignKey("Department")]
    public int DepartmentId { get; set; }
    //navigation property for department
    public Department? department { get; set; }
}
