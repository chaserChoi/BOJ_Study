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
                int n = int.Parse(sr.ReadLine());
                string[] heightStr = sr.ReadLine().Split();
                int[] heights = Array.ConvertAll(heightStr, int.Parse);

                int peak = 0;

                for (int j = 1; j < n - 1; j++)
                {
                    if (heights[j] > heights[j - 1] && heights[j] > heights[j + 1])
                        peak++;
                }

                sw.WriteLine($"Case #{i}: {peak}");
            }

            sw.Flush();
            sw.Close();
            sr.Close();
        }
    }
}
