namespace FileIOcrud
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("FileIO Operation");
            string pathFile = @"D:\C-DAC\.NETCore_MVC\FileIO\FileIOcrud\Sample.txt";
            string CopyFile = @"D:\C-DAC\.NETCore_MVC   \FileIO\FileIOcrud\CpySample.txt";

            File.WriteAllText(pathFile, "Hello World\n I am learning File IO Operations");
            if (File.Exists(pathFile))
            {
                Console.WriteLine("File Exists");
                string content = File.ReadAllText(pathFile);
                Console.WriteLine($"File Content: {content}");

                File.Copy(pathFile, CopyFile);
                Console.WriteLine("File Copied");

                File.Delete(pathFile);
                Console.WriteLine("Deleted");

            }
            else
            {
                Console.WriteLine("File not found");
            }
        }
    }
}
