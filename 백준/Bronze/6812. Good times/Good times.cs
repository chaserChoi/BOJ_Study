using System;
using System.IO;

class Program
{
    static void Main(string[] args)
    {
        using (var sr = new StreamReader(Console.OpenStandardInput()))
        using (var sw = new StreamWriter(Console.OpenStandardOutput()) { AutoFlush = true } )
        {
            int OttawaTime = int.Parse(sr.ReadLine());

            int[] timeDiff = { 0, -180, -120, -60, 0, 60, 90 };
            string[] cities = { "Ottawa", "Victoria", "Edmonton", "Winnipeg", "Toronto", "Halifax", "St. John's" };

            for (int i = 0; i < timeDiff.Length; i++)
            {
                int localTime = ConvertTime(OttawaTime, timeDiff[i]);
                sw.WriteLine($"{localTime} in {cities[i]}");
            }

            sw.Flush();
        }
    }

    static int ConvertTime(int baseTime, int diff)
    {
        int h = baseTime / 100;
        int m = baseTime % 100;
        int totalMin = h * 60 +m + diff;

        if (totalMin < 0)
            totalMin += 24 * 60;
        else if (totalMin >= 24 * 60)
            totalMin -= 24 * 60;

        int newH = totalMin / 60;
        int newM = totalMin % 60;

        return newH * 100 + newM;
    }
}
