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
            int min = int.MaxValue;
            int max = 0;

            for (int i = 0; i < 3; i++)
            {
                string[] line = sr.ReadLine().Split();
                int sH = int.Parse(line[0]);
                int sM = int.Parse(line[1]);
                int eH = int.Parse(line[2]);
                int eM = int.Parse(line[3]);

                int start = sH * 60 + sM;
                int end = eH * 60 + eM;

                int travel = end - start;
                if (travel < 0)
                    travel += 24 * 60;

                min = Math.Min(min, travel);
                max = Math.Max(max, travel);
            }

            sw.WriteLine($"{min / 60}:{min % 60:D2}");
            sw.WriteLine($"{max / 60}:{max % 60:D2}");

            sw.Flush();
            sw.Close();
            sr.Close();
        }
    }
}
