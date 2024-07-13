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
            string[] line = sr.ReadLine().Split();
            int n = int.Parse(line[0]);
            int s = int.Parse(line[1]);

            line = sr.ReadLine().Split();
            int[] times = new int[n];
            for (int i = 0; i < n; i++)
                times[i] = int.Parse(line[i]);

            int max = 0;
            foreach (int time in times)
                max = Math.Max(max, time);

            int limit = (max * s + 999) / 1000;
            sw.WriteLine(limit);

            sw.Flush();
            sw.Close();
            sr.Close();
        }
    }
}
