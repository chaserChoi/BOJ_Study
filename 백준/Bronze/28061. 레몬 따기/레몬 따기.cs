using System;
using System.Globalization;
using System.IO;
using System.Text;

class Program
{
    static void Main(string[] args)
    {
        using (var sr = new StreamReader(Console.OpenStandardInput()))
        using (var sw = new StreamWriter(Console.OpenStandardOutput()) { AutoFlush = true })
        {
            int n = int.Parse(sr.ReadLine());
            List<int> lemons = new List<int>(n);

            string[] line = sr.ReadLine().Split();
            for (int i = 0; i < n; i++)
                lemons.Add(int.Parse(line[i]));

            int max = 0;
            for (int i = 0; i < n; i++)
                max = Math.Max(max, lemons[i] - n + i);

            sw.WriteLine(max);

            sw.Flush();
            sw.Close();
            sr.Close();
        }
    }
}
