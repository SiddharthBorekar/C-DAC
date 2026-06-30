using EFcoreDemo.Model;
using Microsoft.EntityFrameworkCore;
using System;
using System.Collections.Generic;
using System.Text;

namespace EFcoreDemo.Dal
{
    public class DBCon : DbContext
    {
        public DBCon() { 
        
        }

        public DBCon(DbContextOptions options) : base(options)
        {

        }

        public DbSet<Employee> Employees { get; set; }
        public DbSet<Department> Departments { get; set; }

        protected override void OnConfiguring(DbContextOptionsBuilder optionsBuilder)
        {
            optionsBuilder.UseMySQL("server = 127.0.0.1;Port = 3306;Database = EFCore;User ID = root;Password = @Joker123");
        }
    }
}
