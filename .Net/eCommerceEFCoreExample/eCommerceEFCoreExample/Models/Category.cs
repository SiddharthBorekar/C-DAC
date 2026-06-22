using System.ComponentModel;
using System.ComponentModel.DataAnnotations;

namespace eCommerceEFCoreExample.Models;

public class Category
{
    [Key]
    public int CategoryId { get; set; }
    
    [DisplayName("Catgeory Name")]
    [Required(ErrorMessage ="Category name is a required field!")]
    [MaxLength(100, ErrorMessage = "Category Name can not exceed 100 characters!")]
    public string CatgeoryName { get; set; } = string.Empty;

    [DisplayName("Catgeory Description")]
    [Required(ErrorMessage = "Category Description is a required field!")]
    [MaxLength(200, ErrorMessage = "Category Description can not exceed 200 characters!")]
    public string Description { get; set; } = string.Empty;

    //One-To-Many Relationship
    public ICollection<Product> Products { get; set; }

}
