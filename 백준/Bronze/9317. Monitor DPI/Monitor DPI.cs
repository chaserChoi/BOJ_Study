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
                double D = double.Parse(input[0]);
                int X = int.Parse(input[1]);
                int Y = int.Parse(input[2]);

                if (D == 0 && X == 0 && Y == 0) break;

                double W = (16.0 * D) / Math.Sqrt(337);
                double H = (9.0 / 16.0) * W;

                double horizontal = Math.Round(X / W, 2);
                double vertical = Math.Round(Y / H, 2);

                sw.WriteLine($"Horizontal DPI: {horizontal :F2}");
                sw.WriteLine($"Vertical DPI: {vertical :F2}");
            }

            sw.Close();
            sr.Close();
        }
    }
}
