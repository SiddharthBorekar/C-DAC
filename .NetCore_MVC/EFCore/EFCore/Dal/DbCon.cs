using EFCore.Model;
using Microsoft.EntityFrameworkCore;
using System;
using System.Collections.Generic;
using System.Text;

namespace EFCore.Dal
{
    public class DbCon : DbContext
    {
        public DbCon(DbContextOptions options) : base(options)
        {
        }

        protected DbCon()
        {
        }

        public DbSet<Student> Students { get; set; }
        public DbSet<Teacher> Teachers { get; set; }

        protected override void OnConfiguring(DbContextOptionsBuilder optionsBuilder)
        {
            optionsBuilder.UseMySQL("Server = 127.0.0.1; Port = 3306; Database = something; User Id = root; Password  = @Joker123"); 
        }
    }
}
