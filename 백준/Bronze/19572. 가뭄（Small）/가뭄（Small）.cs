using System;
using System.IO;

class Program
{
    static void Main(string[] args)
    {
        using (TextReader sr = new StreamReader(Console.OpenStandardInput()))
        using (TextWriter sw = new StreamWriter(Console.OpenStandardOutput()) { AutoFlush = false })
        {
            string[] input = sr.ReadLine().Split();
            int d1 = int.Parse(input[0]);
            int d2 = int.Parse(input[1]);
            int d3 = int.Parse(input[2]);
            
            double a = (d1 + d2 - d3) / 2.0;
            double b = (d1 + d3 - d2) / 2.0;
            double c = (d2 + d3 - d1) / 2.0;

            if (a <= 0 || b <= 0 || c <= 0)
                sw.WriteLine(-1);
            else
            {
                sw.WriteLine(1);
                sw.WriteLine($"{a:F1} {b:F1} {c:F1}");
            }

            sw.Flush();
            sw.Close();
            sr.Close();
        }
    }
}
