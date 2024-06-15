using System;
using System.IO;
using System.Text;

class Program
{
    static void Main(string[] args)
    {
        using (TextReader sr = new StreamReader(Console.OpenStandardInput()))
        using (TextWriter sw = new StreamWriter(Console.OpenStandardOutput()) { AutoFlush = false })
        {
            int n = int.Parse(sr.ReadLine());
            double max = 0;

            for (int i = 0; i < n; i++)
            {
                string[] input = sr.ReadLine().Split();
                char type = input[0][0];
                double r, h;

                switch (type)
                {
                    case 'C':
                        r = double.Parse(input[1]);
                        h = double.Parse(input[2]);
                        double cone = (1.0 / 3.0) * Math.PI * r * r * h;
                        max = Math.Max(max, cone);
                        break;
                    case 'L':
                        r = double.Parse(input[1]);
                        h = double.Parse(input[2]);
                        double cylinder = Math.PI * r * r * h;
                        max = Math.Max(max, cylinder);
                        break;
                    case 'S':
                        r = double.Parse(input[1]);
                        double sphere = (4.0 / 3.0) * Math.PI * r * r * r;
                        max = Math.Max(max, sphere);
                        break;
                }
            }

            sw.WriteLine("{0:F3}", max);

            sw.Close();
            sr.Close();
        }
    }
}
