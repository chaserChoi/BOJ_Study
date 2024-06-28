using System;
using System.IO;

class Program
{
    static void Main(string[] args)
    {
        using (var sr = new StreamReader(Console.OpenStandardInput()))
        using (var sw = new StreamWriter(Console.OpenStandardOutput()))
        {
            long N = long.Parse(sr.ReadLine());

            sw.WriteLine((N > 0) && ((N & (N - 1)) == 0) ? "1" : "0");

            sw.Flush();
            sw.Close();
            sr.Close();
        }
    }
}
