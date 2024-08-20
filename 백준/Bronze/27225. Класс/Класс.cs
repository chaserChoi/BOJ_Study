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
            int n = int.Parse(sr.ReadLine());
            int m = int.Parse(sr.ReadLine());

            int total = n + m;

            int pairs = Math.Min(n, m);
            int listen = pairs * 2;

            n %= 2;
            m %= 2;

            sw.WriteLine(listen + (n ^ m));

            sw.Flush();
            sw.Close();
            sr.Close();
        }
    }
}
