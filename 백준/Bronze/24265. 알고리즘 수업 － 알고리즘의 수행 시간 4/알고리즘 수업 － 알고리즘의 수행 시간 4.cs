using System;
using System.IO;
using System.Text;

class Program
{
    static void Main(string[] args)
    {
        using (var sr = new StreamReader(Console.OpenStandardInput()))
        using (var sw = new StreamWriter(Console.OpenStandardOutput()) { AutoFlush = true })
        {
            long n = long.Parse(sr.ReadLine());
            
            sw.WriteLine((n - 1) * n / 2);
            sw.WriteLine(2);

            sw.Flush();
            sw.Close();
            sr.Close();
        }
    }
}
