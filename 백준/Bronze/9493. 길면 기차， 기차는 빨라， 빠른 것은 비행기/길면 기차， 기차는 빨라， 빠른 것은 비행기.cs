using System;
using System.IO;

class Program
{
    static void Main(string[] args)
    {
        using (StreamReader sr = new StreamReader(Console.OpenStandardInput()))
        using (StreamWriter sw = new StreamWriter(Console.OpenStandardOutput()) { AutoFlush = false })
        {
            while (true)
            {
                string[] input = sr.ReadLine().Split();
                double M = double.Parse(input[0]);
                double A = double.Parse(input[1]);
                double B = double.Parse(input[2]);

                if (M == 0 && A == 0 && B == 0) break;

                double result = Math.Round((M / A - M / B) * 3600);

                int h = (int)(result / 3600);
                int m = (int)((result / 60) % 60);
                int s = (int)(result % 60);

                sw.WriteLine($"{h}:{m:D2}:{s:D2}");
            }

            sw.Close();
            sr.Close();
        }
    }
}
