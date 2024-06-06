using System;
using System.IO;

class Program
{
    static void Main()
    {
        using (var sr = new StreamReader(Console.OpenStandardInput()))
        using (var sw = new StreamWriter(Console.OpenStandardOutput()))
        {
            int t = 1;

            while (true) {
                string[] inputs = sr.ReadLine().Split(' ');
                double a = double.Parse(inputs[0]);
                double b = double.Parse(inputs[1]);
                double c = double.Parse(inputs[2]);

                if (a == 0 && b == 0 && c == 0) break;

                sw.WriteLine($"Triangle #{t}");
                t++;

                if (a == -1)
                {
                    if (c <= b)
                        sw.WriteLine("Impossible.");
                    else
                    {
                        a = Math.Sqrt(c * c - b * b);
                        sw.WriteLine($"a = {a:F3}");
                    }
                }
                else if (b == -1)
                {
                    if (c <= a)
                        sw.WriteLine("Impossible.");
                    else
                    {
                        b = Math.Sqrt(c * c - a * a);
                        sw.WriteLine($"b = {b:F3}");
                    }
                }
                else 
                {
                    c = Math.Sqrt(a * a + b * b);
                    sw.WriteLine($"c = {c:F3}");
                }
                sw.WriteLine();
            }
        }
    }
}
