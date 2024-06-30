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
            string[] waiting = sr.ReadLine().Split();
            int waitX = int.Parse(waiting[0]);
            int waitY = int.Parse(waiting[1]);

            int taxiCnt = int.Parse(sr.ReadLine());

            int closeTaxiX = 0, closeTaxiY = 0;
            int min = int.MaxValue;
            for (int i = 0; i < taxiCnt; i++)
            {
                string[] taxi = sr.ReadLine().Split();
                int taxiX = int.Parse(taxi[0]);
                int taxiY = int.Parse(taxi[1]);

                int dist = Math.Abs(taxiX - waitX) + Math.Abs(taxiY - waitY);
                if (dist < min)
                {
                    min = dist;
                    closeTaxiX = taxiX;
                    closeTaxiY = taxiY;
                }
            }

            sw.WriteLine($"{closeTaxiX} {closeTaxiY}");

            sw.Flush();
            sw.Close();
            sr.Close();
        }
    }
}
