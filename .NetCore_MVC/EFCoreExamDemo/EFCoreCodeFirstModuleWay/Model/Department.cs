using System.ComponentModel.DataAnnotations;

namespace EFCoreCodeFirstModuleWay.Model;

public class Department
{
    [Key]
    public int DepartmentId { get; set; }

    [Required]
    [StringLength(100)]
    public string DepartmentName { get; set; } =string.Empty;

    [StringLength(100)]
    public string Location { get; set; } = string.Empty;

    //navigation property for employees
    public ICollection<Employee>? Employees { get; set; }

}
