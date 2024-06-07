using System;
using System.IO;

class Program
{
    static void Main(string[] args)
    {
        using (var sr = new StreamReader(Console.OpenStandardInput()))
        using (var sw = new StreamWriter(Console.OpenStandardOutput()) { AutoFlush = true } )
        {
            int m = int.Parse(sr.ReadLine());
            int n = int.Parse(sr.ReadLine());
            int ways = 0;

            for (int i = 1; i <= m; i++)
            {
                for (int j = 1; j <= n; j++)
                {
                    if (i + j == 10)
                        ways++;
                }
            }

            if (ways == 1)
                sw.WriteLine($"There is {ways} way to get the sum 10.");
            else
                sw.WriteLine($"There are {ways} ways to get the sum 10.");

            sw.Flush();
        }
    }
}
