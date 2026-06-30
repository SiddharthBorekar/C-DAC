using EFCoreCodeFirstModuleWay.Model;
using Microsoft.EntityFrameworkCore;

namespace EFCoreCodeFirstModuleWay.Dal;

public class DBCon : DbContext
{
    public DBCon()
    {

    }
    public DBCon(DbContextOptions<DBCon> options) : base(options)
    {

    }
    public DbSet<Employee> Employees { get; set; }
    public DbSet<Department> Departments { get; set; }

    protected override void OnConfiguring(DbContextOptionsBuilder optionsBuilder)
    {
        optionsBuilder.UseMySQL("Server = 127.0.0.1; Port = 3306; Database = EmpDB; User Id = root; Password = @Joker123;");
    }
}
