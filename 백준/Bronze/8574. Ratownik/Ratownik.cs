using System;
using System.Globalization;
using System.IO;

class Program
{
    static void Main(string[] args)
    {
        using (StreamReader sr = new StreamReader(Console.OpenStandardInput()))
        using (StreamWriter sw = new StreamWriter(Console.OpenStandardOutput()) { AutoFlush = false })
        {
            string[] line = sr.ReadLine().Split();
            int n = int.Parse(line[0]);
            int k = int.Parse(line[1]);
            int lifeguardX = int.Parse(line[2]);
            int lifeguardY = int.Parse(line[3]);

            int outOfRangeCnt = 0;
            int kSquared = k * k;

            for (int i = 0; i < n; i++)
            {
                string[] childPosition = sr.ReadLine().Split();
                int childX = int.Parse(childPosition[0]);
                int childY = int.Parse(childPosition[1]);

                int distanceSquared = (childX - lifeguardX) * (childX - lifeguardX) + (childY - lifeguardY) * (childY - lifeguardY);

                if (distanceSquared > kSquared)
                    outOfRangeCnt++;
            }

            sw.WriteLine(outOfRangeCnt);

            sr.Close();
            sw.Close();
        }
    }
}