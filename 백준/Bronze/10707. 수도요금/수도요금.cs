using System;
using System.IO;
using System.Text;

class Program
{
    static void Main(string[] args)
    {
        using (TextReader sr = new StreamReader(Console.OpenStandardInput()))
        using (TextWriter sw = new StreamWriter(Console.OpenStandardOutput()) { AutoFlush = false })
        {
            int a = int.Parse(sr.ReadLine());
            int b = int.Parse(sr.ReadLine());
            int c = int.Parse(sr.ReadLine());
            int d = int.Parse(sr.ReadLine());
            int p = int.Parse(sr.ReadLine());

            sw.WriteLine($"{Math.Min(a * p, b + Math.Max(0, p - c) * d)}");

            sw.Flush();
            sw.Close();
            sr.Close();
        }
    }
}
