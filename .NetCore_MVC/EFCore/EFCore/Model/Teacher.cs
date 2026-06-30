using System.ComponentModel.DataAnnotations;

namespace EFCore.Model;

public class Teacher
{
    [Key]
    public int TeacherId { get; set; }
    [Required]
    [StringLength(100)]
    public string TeacherName { get; set; } = string.Empty;
    [Required]
    [StringLength(100)]
    public string teacherSub { get; set; } = string.Empty;

    public ICollection<Student>? Students { get; set; }
}
