using eCommerceEFCoreExample.Dal;

namespace eCommerceEFCoreExample;

internal class Program
{
    static void Main(string[] args)
    {
        Console.WriteLine("EF Core CRUD Operations!");
        eCommerceDbContext dbContext = new eCommerceDbContext();
        var catgeories=from cat in dbContext.Categories
                       select cat;
        foreach (var category in catgeories)
        {
            Console.WriteLine($"Category {category.CatgeoryName} and its description is {category.Description}!");
        }
        //dbContext.Categories.Add(new Models.Category()
        //{
        //    CatgeoryName="Formal School Shoes",
        //    Description= "All Kids Formal School Shoes!"
        //});
        //dbContext.SaveChanges();
    }
}
