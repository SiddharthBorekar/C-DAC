using System.ComponentModel.DataAnnotations;

namespace eCommerceEFCoreExample.Models;

public class Product
{
    [Key]
    public int ProductId { get; set; }
    [Required(ErrorMessage ="Product Name is a required field!")]
    [MaxLength(100, ErrorMessage ="Product name can not exceed 100 characters!")]
    public string ProductName { get; set; } = string.Empty;
    [Required(ErrorMessage = "Product Description is a required field!")]
    [MaxLength(200, ErrorMessage = "Product Description can not exceed 200 characters!")]
    public string ProductDescription { get; set; }= string.Empty;
    [Required(ErrorMessage = "Product Unit Price is a required field!")]
    public decimal UnitPrice { get; set; }
    [Required(ErrorMessage = "Product Stock is a required field!")]
    public int Stock { get; set; }
    public bool? IsBlackListed { get; set; }
    public int CategoryId { get; set; }

    //Navigation
    public Category Category { get; set; }

}
