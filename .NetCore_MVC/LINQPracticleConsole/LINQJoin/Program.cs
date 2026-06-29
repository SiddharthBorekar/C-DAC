namespace LINQJoin
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("LINQ Example");
            var CustomerOrders = from Customer in getAllCustomers()
                                 join Order in getAllOrders()
                                 on Customer.customerID equals Order.customerId
                                 join product in getAllProducts() on Order.productId equals product.productID
                                 select new { CustName = Customer.CustomerName, CustomerCity = Customer.City, Quantity = Order.quantity, OrderDate = Order.orderDate, ProductName = product.productName, TotalAmount = Order.quantity * product.UnitPrive };
            foreach (var details in CustomerOrders)
            {
                Console.WriteLine($"Customer Name: {details.CustName} Living In: {details.CustomerCity} Quantity: {details.Quantity} OrderDate: {details.OrderDate} ProductName: {details.ProductName} TotalAmount: {details.TotalAmount}");
            }
        }

        private static List<Customer> getAllCustomers()
        {

            return new List<Customer>()
            {
                new Customer() { customerID = 1, CustomerName= "Rohan", City = "Pune"},
                new Customer() { customerID = 2, CustomerName= "Sakshi", City = "Pune"},
                new Customer() { customerID = 3, CustomerName= "Naval", City = "Solapur"},
                new Customer() { customerID = 4, CustomerName= "Akshay", City = "Beed"}
            };
        }
        private static List<Product> getAllProducts()
        {
            return new List<Product>()
            {
                new Product(){ productID = 1223, productName="Mouse", Stock=5, UnitPrive = 850},
                new Product(){ productID = 1224, productName="Laptop", Stock=6, UnitPrive = 85000},
                new Product(){ productID = 1225, productName="iphone", Stock=15, UnitPrive = 130550},
            };
        }

        private static List<Order> getAllOrders()
        {
            return new List<Order>()
                {
                    new Order(){ orderId = 100, quantity = 2, orderDate = DateTime.Now, customerId = 1,productId=1224},
                    new Order(){ orderId = 101, quantity = 1, orderDate = DateTime.Now, customerId = 1,productId=1225},
                    new Order(){ orderId = 102, quantity = 10, orderDate = DateTime.Now, customerId = 3,productId=1223},
                    new Order(){ orderId = 103, quantity = 3, orderDate = DateTime.Now, customerId = 4,productId=1224},
                };
        }
    }
}
