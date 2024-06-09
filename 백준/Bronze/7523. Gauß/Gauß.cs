using System;
using System.IO;

class Program
{
    static void Main(string[] args)
    {
        using (StreamReader sr = new StreamReader(Console.OpenStandardInput()))
        using (StreamWriter sw = new StreamWriter(Console.OpenStandardOutput()) { AutoFlush = false })
        {
            int T = int.Parse(sr.ReadLine());

            for (int i = 1; i <= T; i++)
            {
                string[] inputs = sr.ReadLine().Split();
                long n = long.Parse(inputs[0]);
                long m = long.Parse(inputs[1]);

                sw.WriteLine($"Scenario #{i}:");
                sw.WriteLine(((m + n) * (m - n + 1)) / 2);
                sw.WriteLine();
            }

            sr.Close();
            sw.Close();
        }
    }
}