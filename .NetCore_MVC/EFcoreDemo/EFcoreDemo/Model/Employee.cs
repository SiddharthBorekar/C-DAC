using System;
using System.Collections.Generic;
using System.ComponentModel.DataAnnotations;
using System.ComponentModel.DataAnnotations.Schema;
using System.Text;

namespace EFcoreDemo.Model;

    public class Employee
    {
        [Key]
        public int EmpID { get; set; }
        [Required]
        [StringLength(50)]
        public string Empname { get; set; } = string.Empty;
            
        public string EmpEmail { get; set; } = string.Empty;
        [ForeignKey("Department")]
        public int DeptID { get; set; }

        public Department? department { get; set; }
    }
