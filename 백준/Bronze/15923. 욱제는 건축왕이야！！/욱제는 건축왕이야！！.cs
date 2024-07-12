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
            int N = int.Parse(sr.ReadLine());
            List<(int x, int y)> points = new List<(int x, int y)>();

            for (int i = 0; i < N; i++)
            {
                string[] line = sr.ReadLine().Split();
                int x = int.Parse(line[0]);
                int y = int.Parse(line[1]);
                points.Add((x, y));
            }

            int perimeter = 0;
            for (int i = 0; i < N; i++)
            {
                int x1 = points[i].x;
                int y1 = points[i].y;
                int x2 = points[(i + 1) % N].x;
                int y2 = points[(i + 1) % N].y;

                perimeter += Math.Abs(x2 - x1) + Math.Abs(y2 - y1);
            }

            sw.WriteLine(perimeter);

            sw.Flush();
            sw.Close();
            sr.Close();
        }
    }
}
