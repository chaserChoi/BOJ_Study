using System;
using System.IO;

class Program
{
    static void Main(string[] args)
    {
        using (StreamReader sr = new StreamReader(Console.OpenStandardInput()))
        using (StreamWriter sw = new StreamWriter(Console.OpenStandardOutput()) { AutoFlush = false })
        {
            int P = int.Parse(sr.ReadLine());

            for (int i = 0; i < P; i++)
            {
                string[] input = sr.ReadLine().Split();
                int N = int.Parse(input[0]);
                double D = double.Parse(input[1]);
                double A = double.Parse(input[2]);
                double B = double.Parse(input[3]);
                double F = double.Parse(input[4]);

                double dist = 0;
                double time = D / (A + B);
                dist = F * time;

                sw.WriteLine($"{N} {dist:F6}");
            }

            sw.Close();
            sr.Close();
        }
    }
}
