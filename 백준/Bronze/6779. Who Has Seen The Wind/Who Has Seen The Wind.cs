using System;
using System.IO;

class Program
{
    static void Main(string[] args)
    {
        using (var sr = new StreamReader(Console.OpenStandardInput()))
        using (var sw = new StreamWriter(Console.OpenStandardOutput()) { AutoFlush = true } )
        {
            int h = int.Parse(sr.ReadLine());
            int M = int.Parse(sr.ReadLine());

            bool touchesGround = false;

            for (int t = 1; t <= M; t++)
            {
                double A = -6 * Math.Pow(t, 4) + h * Math.Pow(t, 3) + 2 * Math.Pow(t, 2) + t;

                if (A <= 0)
                {
                    sw.WriteLine($"The balloon first touches ground at hour: {t}");
                    touchesGround = true;
                    break;
                }
            }

            if (!touchesGround)
                sw.WriteLine("The balloon does not touch ground in the given time.");

            sw.Flush();
        }
    }
}
