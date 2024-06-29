using System;
using System.IO;

class Program
{
    static void Main(string[] args)
    {
        using (var sr = new StreamReader(Console.OpenStandardInput()))
        using (var sw = new StreamWriter(Console.OpenStandardOutput()))
        {
            int T = int.Parse(sr.ReadLine());
            for (int i = 1; i <= T; i++)
            {
                int N = int.Parse(sr.ReadLine());
                string[] input = sr.ReadLine().Split();
                double[] heights = new double[N];
                for (int j = 0; j < N; j++)
                    heights[j] = double.Parse(input[j]);
                
                for (int j = 1; j < N - 1; j++)
                {
                    double avg = (heights[j - 1] + heights[j + 1]) / 2;
                    if (heights[j] > avg)
                        heights[j] = avg;
                }

                sw.WriteLine($"Case #{i}: {heights[N - 2]:F6}");
            }

            sw.Flush();
            sw.Close();
            sr.Close();
        }
    }
}
