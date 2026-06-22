using eCommerceEFCoreExample.Models;
using Microsoft.EntityFrameworkCore;

namespace eCommerceEFCoreExample.Dal;

public class eCommerceDbContext : DbContext
{
    public eCommerceDbContext()
    {
        
    }
    public eCommerceDbContext(DbContextOptions<eCommerceDbContext> options):base(options)
    {
        
    }

    public DbSet<Category> Categories { get; set; }
    public DbSet<Product> Products { get; set; }
    public DbSet<Customer> Customers { get; set; }

    protected override void OnConfiguring(DbContextOptionsBuilder optionsBuilder)
    {
        if (!optionsBuilder.IsConfigured)
        {
            optionsBuilder.UseMySQL("Server=192.168.100.99;Port=3306;Database=SampleEComDb;User Id=saleel;Password=saleel;");
        }
    }


}
