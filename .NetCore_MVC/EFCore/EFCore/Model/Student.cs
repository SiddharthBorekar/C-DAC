using Microsoft.EntityFrameworkCore;
using System.ComponentModel.DataAnnotations;
using System.ComponentModel.DataAnnotations.Schema;

namespace EFCore.Model;

public class Student
{
    [Key]
    public int StudentId { get; set; }
    [Required]
    [StringLength(50)]
    public string StudentName { get; set; } = string.Empty;
    [Required]
    [StringLength (50)]
    public string StudentSub { get; set; } = string.Empty;

    [ForeignKey("Teacher")]
    public int TeacherId { get; set; }

    public Teacher? Teachers { get; set; }
}
