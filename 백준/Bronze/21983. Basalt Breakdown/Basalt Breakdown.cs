using System;
using System.Globalization;
using System.IO;
using System.Text;

class Program
{
    static void Main(string[] args)
    {
        using (var sr = new StreamReader(Console.OpenStandardInput()))
        using (var sw = new StreamWriter(Console.OpenStandardOutput()) { AutoFlush = true })
        {
            long a = long.Parse(sr.ReadLine());

            double peri = Math.Sqrt((double)a * 24 / Math.Sqrt(3));

            sw.WriteLine(peri.ToString("F7"));

            sw.Flush();
            sw.Close();
            sr.Close();
        }
    }
}
