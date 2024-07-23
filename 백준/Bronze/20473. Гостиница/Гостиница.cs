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
            int n = int.Parse(sr.ReadLine());

            sw.WriteLine((n % 3 == 2 ? 1 : (n % 3 == 1 ? 2 : 0)) + " " + (n / 3 - (n % 3 == 1 ? 1 : 0)));

            sw.Flush();
            sw.Close();
            sr.Close();
        }
    }
}
