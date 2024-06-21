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
            int T = int.Parse(sr.ReadLine());
            for (int i = 1; i <= T; i++)
            {
                string[] input = sr.ReadLine().Split();
                int n = int.Parse(input[0]);
                int r1 = int.Parse(input[1]);
                int c1 = int.Parse(input[2]);
                int r2 = int.Parse(input[3]);
                int c2 = int.Parse(input[4]);

                sw.WriteLine($"Case {i}: {(Math.Abs(r1 - r2) * Math.Abs(c1 - c2) == 2 ? "YES" : "NO")}");
            }

            sw.Flush();
            sw.Close();
            sr.Close();
        }
    }
}
