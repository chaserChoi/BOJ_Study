using System;
using System.IO;

class Program
{
    static void Main(string[] args)
    {
        using (StreamReader sr = new StreamReader(Console.OpenStandardInput()))
        using (StreamWriter sw = new StreamWriter(Console.OpenStandardOutput()) { AutoFlush = false })
        {
            int n = int.Parse(sr.ReadLine());
            int ans = 0;
            int prev = 0;

            for (int i = 0; i < n; i++)
            {
                string[] input = sr.ReadLine().Split();
                int t = int.Parse(input[0]);
                int m = int.Parse(input[1]);

                if (m == 0)
                    continue;

                ans = Math.Max(ans, t - prev);
                prev = t;
            }

            sw.WriteLine(ans);

            sr.Close();
            sw.Close();
        }
    }
}