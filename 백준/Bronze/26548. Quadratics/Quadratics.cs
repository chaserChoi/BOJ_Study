using System;
using System.IO;
using System.Text;

class Program
{
    static void Main(string[] args)
    {
        using (var sr = new StreamReader(Console.OpenStandardInput()))
        using (var sw = new StreamWriter(Console.OpenStandardOutput()) { AutoFlush = true })
        {
            int n = int.Parse(sr.ReadLine());
            
            for (int i = 0; i < n; i++)
            {
                string[] line = sr.ReadLine().Split();
                double a = double.Parse(line[0]);
                double b = double.Parse(line[1]);
                double c = double.Parse(line[2]);

                double disc = b * b - 4 * a * c;
                double sqrt = Math.Sqrt(disc);

                double x1 = (-b + sqrt) / (2 * a);
                double x2 = (-b - sqrt) / (2 * a);

                sw.WriteLine($"{x1:F3}, {x2:F3}");
            }

            sw.Flush();
            sw.Close();
            sr.Close();
        }
    }
}
