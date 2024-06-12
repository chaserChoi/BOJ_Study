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
                int N = int.Parse(sr.ReadLine());

                double minX = 1001, maxX = -1001;
                double minY = 1001, maxY = -1001;

                for (int n = 0; n < N; n++)
                {
                    string[] input = sr.ReadLine().Split();
                    double X = double.Parse(input[0]);
                    double Y = double.Parse(input[1]);

                    minX = Math.Min(minX, X);
                    maxX = Math.Max(maxX, X);
                    minY = Math.Min(minY, Y);
                    maxY = Math.Max(maxY, Y);
                }

                sw.Write($"Case {t}: ");

                double area = Math.Abs((maxX - minX) * (maxY - minY));
                double perimeter = Math.Abs((maxX - minX) + (maxY - minY)) * 2;

                sw.WriteLine($"Area {area:F9}, Perimeter {perimeter:F9}");
            }

            sw.Close();
            sr.Close();
        }
    }
}
