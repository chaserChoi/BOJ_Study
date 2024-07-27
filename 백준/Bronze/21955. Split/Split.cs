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
            long n = long.Parse(sr.ReadLine());

            string num = n.ToString();

            int mid = num.Length / 2;

            string first = num.Substring(0, mid);
            string second = num.Substring(mid);

            sw.WriteLine($"{first} {second}");

            sw.Flush();
            sw.Close();
            sr.Close();
        }
    }
}
