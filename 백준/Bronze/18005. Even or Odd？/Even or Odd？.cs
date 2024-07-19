using System;
using System.IO;
using System.Text;

class Program
{
    static void Main(string[] args)
    {
        using (var sr = new StreamReader(Console.OpenStandardInput()))
        using (var sw = new StreamWriter(Console.OpenStandardOutput()))
        {
            long n = long.Parse(sr.ReadLine());

            sw.WriteLine((n % 2 == 0) ? ((n * (n + 1) % 4) == 0 ? 2 : 1) : 0);

            sw.Flush();
            sw.Close();
            sr.Close();
        }
    }
}
