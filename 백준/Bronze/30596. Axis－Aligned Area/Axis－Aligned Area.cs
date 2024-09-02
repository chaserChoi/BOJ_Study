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
            int a1 = int.Parse(sr.ReadLine());
            int a2 = int.Parse(sr.ReadLine());
            int a3 = int.Parse(sr.ReadLine());
            int a4 = int.Parse(sr.ReadLine());

            int max = Math.Max(
                Math.Min(a1, a2) * Math.Min(a3, a4),
                Math.Max(
                    Math.Min(a1, a3) * Math.Min(a2, a4),
                    Math.Min(a1, a4) * Math.Min(a2, a3)
                )
            );

            sw.WriteLine(max);

            sw.Flush();
            sw.Close();
            sr.Close();
        }
    }
}
