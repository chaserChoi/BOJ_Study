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
            double min = double.MaxValue;
            double max = double.MinValue;
            double sum = 0.0;

            for (int i = 0; i < n; i++)
            {
                var line = sr.ReadLine().Split();
                long a = long.Parse(line[0]);
                long b = long.Parse(line[1]);

                double v = (double)a / b;
                sum += v;

                if (v < min)
                    min = v;
                if (v > max)
                    max = v;
            }

            sw.WriteLine($"{min.ToString("F10", CultureInfo.InvariantCulture)} {max.ToString("F10", CultureInfo.InvariantCulture)} {sum.ToString("F10", CultureInfo.InvariantCulture)}");

            sw.Flush();
            sw.Close();
            sr.Close();
        }
    }
}
