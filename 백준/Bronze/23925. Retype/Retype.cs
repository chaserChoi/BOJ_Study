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
            int t = int.Parse(sr.ReadLine());

            for (int i = 1; i <= t; i++)
            {
                string[] line = sr.ReadLine().Split();
                long n = long.Parse(line[0]);
                long k = long.Parse(line[1]);
                long s = long.Parse(line[2]);

                sw.WriteLine($"Case #{i}: {n + k + Math.Min(0, Math.Abs(k - s) - s)}");
            }

            sw.Flush();
            sw.Close();
            sr.Close();
        }
    }
}
