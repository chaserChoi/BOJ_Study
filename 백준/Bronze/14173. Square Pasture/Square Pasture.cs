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
            string[] line1 = sr.ReadLine().Split();
            int x1 = int.Parse(line1[0]);
            int y1 = int.Parse(line1[1]);
            int x2 = int.Parse(line1[2]);
            int y2 = int.Parse(line1[3]);

            string[] line2 = sr.ReadLine().Split();
            int x3 = int.Parse(line2[0]);
            int y3 = int.Parse(line2[1]);
            int x4 = int.Parse(line2[2]);
            int y4 = int.Parse(line2[3]);

            int minX = Math.Min(x1, x3);
            int minY = Math.Min(y1, y3);
            int maxX = Math.Max(x2, x4);
            int maxY = Math.Max(y2, y4);

            int side = Math.Max(maxX - minX, maxY - minY);
            sw.WriteLine(side * side);

            sw.Flush();
            sw.Close();
            sr.Close();
        }
    }
}
