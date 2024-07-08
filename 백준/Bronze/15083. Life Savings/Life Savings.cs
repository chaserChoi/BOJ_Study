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
            string[] line = sr.ReadLine().Split();
            int p1 = int.Parse(line[0]);
            int p2 = int.Parse(line[1]);
            int p3 = int.Parse(line[2]);

            string[] line2 = sr.ReadLine().Split();
            double c1 = double.Parse(line2[0]);
            double c2 = double.Parse(line2[1]);
            double c3 = double.Parse(line2[2]);

            if (p1 > p2) Swap(ref p1, ref p2);
            if (p2 > p3) Swap(ref p2, ref p3);
            if (p1 > p2) Swap(ref p1, ref p2);

            double one = (p1 + p2 + p3) * c1 / 100;
            double two = p2 * Math.Min(c2, c3) / 100 + p3 * Math.Max(c2, c3) / 100;

            sw.WriteLine($"{(one > two ? "one" : "two")} {Math.Max(one, two):F2}");

            sw.Flush();
            sw.Close();
            sr.Close();
        }
    }

    static void Swap(ref int a, ref int b) 
    {
        int temp = a;
        a = b;
        b = temp;
    }
}
