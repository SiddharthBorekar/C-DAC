using System.ComponentModel;
using System.ComponentModel.DataAnnotations;

namespace eCommerceEFCoreExample.Models;

public class Customer
{
    [Key]
    public int CustomerId { get; set; }
    [DisplayName("Contact Name")]
    [Required(ErrorMessage = "Contact name is a required field!")]
    [MaxLength(100, ErrorMessage = "Contact Name can not exceed 100 characters!")]
    public string ContactName { get; set; } = string.Empty;
    [DisplayName("City")]
    [Required(ErrorMessage = "City name is a required field!")]
    [MaxLength(50, ErrorMessage = "City Name can not exceed 50 characters!")]
    public string City { get; set; } = string.Empty;
}
