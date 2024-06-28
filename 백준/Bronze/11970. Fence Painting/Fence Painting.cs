using System;
using System.IO;

class Program
{
    static void Main(string[] args)
    {
        using (var sr = new StreamReader(Console.OpenStandardInput()))
        using (var sw = new StreamWriter(Console.OpenStandardOutput()))
        {
            int[] fence = new int[101];
            string[] line1 = sr.ReadLine().Split();
            int a = int.Parse(line1[0]);
            int b = int.Parse(line1[1]);

            string[] line2 = sr.ReadLine().Split();
            int c = int.Parse(line2[0]);
            int d = int.Parse(line2[1]);

            if (a >= c && a <= d || c >= a && c <= b)
                sw.WriteLine(Math.Max(Math.Max(a, b), Math.Max(c, d)) - Math.Min(Math.Min(a, b), Math.Min(c, d)));
            else
                sw.WriteLine(b + d - a - c);

            sw.Flush();
            sw.Close();
            sr.Close();
        }
    }
}
