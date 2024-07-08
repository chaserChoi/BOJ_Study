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
            int n = int.Parse(sr.ReadLine());
            string[] line = sr.ReadLine().Split();
            double x = double.Parse(line[0]);
            double y = double.Parse(line[1]);

            for (int i = 0; i < n - 1; i++) 
            {
                string[] line2 = sr.ReadLine().Split();
                string dir = line2[0];
                int d = int.Parse(line2[1]);

                switch (dir)
                {
                    case "N":
                        y += d;
                        break;
                    case "NE":
                        x += d / Math.Sqrt(2);
                        y += d / Math.Sqrt(2);
                        break;
                    case "E":
                        x += d;
                        break;
                    case "SE":
                        x += d / Math.Sqrt(2);
                        y -= d / Math.Sqrt(2);
                        break;
                    case "S":
                        y -= d;
                        break;
                    case "SW":
                        x -= d / Math.Sqrt(2);
                        y -= d / Math.Sqrt(2);
                        break;
                    case "W":
                        x -= d;
                        break;
                    case "NW":
                        x -= d / Math.Sqrt(2);
                        y += d / Math.Sqrt(2);
                        break;
                }
            }

            sw.WriteLine($"{x:F8} {y:F8}");

            sw.Flush();
            sw.Close();
            sr.Close();
        }
    }
}
