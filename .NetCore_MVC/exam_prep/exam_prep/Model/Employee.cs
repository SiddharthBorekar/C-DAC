using System.ComponentModel.DataAnnotations;

namespace exam_prep.Model;

internal class Employee
{
    [Key]   
    public int Id { get; set; }
    public string Name { get; set; } = string.Empty;

    [StringLength(100,ErrorMessage ="Email shouuld be max 100 char")]
    [Required]
    public string email { get; set; } = string.Empty;
}
