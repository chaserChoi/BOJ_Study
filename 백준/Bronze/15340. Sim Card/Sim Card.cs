using System;
using System.IO;
using System.Text;

class Program
{
    static void Main(string[] args)
    {
        using (var sr = new StreamReader(Console.OpenStandardInput()))
        using (var sw = new StreamWriter(Console.OpenStandardOutput()))
        {
            int[][] prices = new int[][]
            {
                new int[] { 30, 40 },
                new int[] { 35, 30 },
                new int[] { 40, 20 }
            };

            while (true) 
            {
                string[] line = sr.ReadLine().Split();
                int c = int.Parse(line[0]);
                int d = int.Parse(line[1]);

                if (c == 0 && d == 0) break;

                int minCost = int.MaxValue;
                for (int i = 0; i < 3; i++)
                {
                    int call = c * prices[i][0];
                    int data = d * prices[i][1];
                    int total = call + data;
                    minCost = Math.Min(minCost, total);
                }

                sw.WriteLine(minCost);
            }

            sw.Flush();
            sw.Close();
            sr.Close();
        }
    }
}
