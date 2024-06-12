using System;
using System.IO;
using System.Collections.Generic;

class Program
{
    static void Main(string[] args)
    {
        using (StreamReader sr = new StreamReader(Console.OpenStandardInput()))
        using (StreamWriter sw = new StreamWriter(Console.OpenStandardOutput()) { AutoFlush = false })
        {
            int T = int.Parse(sr.ReadLine());

            for (int t = 1; t <= T; t++)
            {
                int sum = int.Parse(sr.ReadLine());
                List<string> results = new List<string>();

                for (int i = 1; i <= 6; i++)
                {
                    for (int j = i; j <= 6; j++)
                    {
                        if (i + j == sum)
                            results.Add($"({i},{j})");
                    }
                }

                sw.WriteLine($"Case {t}:");
                foreach (string result in results)
                    sw.WriteLine(result);
            }

            sw.Close();
            sr.Close();
        }
    }
}