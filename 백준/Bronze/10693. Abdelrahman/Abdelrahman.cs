using System;
using System.IO;

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
                int m = int.Parse(input[1]);

                sw.WriteLine($"Case {i}: {m - n + 1}");
            }

            sw.Flush();
            sw.Close();
            sr.Close();
        }
    }
}
