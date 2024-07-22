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

            int p = 0;

            while (n % 2 == 0)
            {
                n /= 2;
                p++;
            }

            int o = n;

            sw.WriteLine($"{o} {p}");

            sw.Flush();
            sw.Close();
            sr.Close();
        }
    }
}
