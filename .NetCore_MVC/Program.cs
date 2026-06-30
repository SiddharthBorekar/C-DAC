namespace FileIOOperation
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("File IO Operation");

            string filePath = @"D:\CDAC\Adventure\.NET_ASP\ExamPreparation\FileIOOperation\Sample.txt";
            string cpyPath = @"D:\CDAC\Adventure\.NET_ASP\ExamPreparation\FileIOOperation\CpySample.txt";
            string movePath = @"D:\CDAC\Adventure\.NET_ASP\ExamPreparation\FileIOOperation\MvSample.txt";

            //creation and checking of file
            if (!File.Exists(filePath))
            {
                Console.WriteLine("File Not Exits");
                FileStream fs = File.Create(filePath);
                fs.Close();
                Console.WriteLine("File Created successfully");
            }
            else
            {
                Console.WriteLine("File Exits");
            }

            //write to file
            File.WriteAllText(filePath, "Hello World\n");
            Console.WriteLine("Data Written Successfully");

            //appendToFile
            File.AppendAllText(filePath, "File handling operation\n");
            File.AppendAllText(filePath, "Example of appendtext");
            Console.WriteLine("Data appended successfully");

            //read file

            string[] lines = File.ReadAllLines(filePath);
            foreach (string line in lines)
            {
                Console.WriteLine(line);
            }

            //copy file
            if (File.Exists(cpyPath))
            {
                File.Delete(cpyPath);
            }
           
            File.Copy(filePath, cpyPath);
            Console.WriteLine("Data copied successfully");
            

            //Move file
            if (File.Exists(movePath))
            {
                File.Delete(movePath);
            }
        
            File.Move(cpyPath, movePath);
            Console.WriteLine("File Moved Successfully");
            

            //delete file
            //if (File.Exists(movePath))
            //{
            //    File.Delete(movePath);
            //    Console.WriteLine("File Deleted Successfully");
            //}

        }
    }
}


