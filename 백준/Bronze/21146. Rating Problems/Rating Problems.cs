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
            string[] line = sr.ReadLine().Split();
            int n = int.Parse(line[0]);
            int k = int.Parse(line[1]);

            int cur = 0;

            for (int i = 0; i < k; i++)
                cur += int.Parse(sr.ReadLine());

            int remain = n - k;

            double minAvg = (double)(cur + remain * -3) / n;
            double maxAvg = (double)(cur + remain * 3) / n;

            sw.WriteLine($"{minAvg.ToString("F10", CultureInfo.InvariantCulture)} {maxAvg.ToString("F10", CultureInfo.InvariantCulture)}");

            sw.Flush();
            sw.Close();
            sr.Close();
        }
    }
}
