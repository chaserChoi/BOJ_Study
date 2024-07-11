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
            int a = int.Parse(line[0]);
            int b = int.Parse(line[1]);
            int x = int.Parse(line[2]);
            int y = int.Parse(line[3]);

            int dist = Math.Abs(a - b);
            if (Math.Abs(a - x) + Math.Abs(y - b) < dist)
                dist = Math.Abs(a - x) + Math.Abs(y - b);
            if (Math.Abs(b - x) + Math.Abs(y - a) < dist)
                dist = Math.Abs(b - x) + Math.Abs(y - a);

            sw.WriteLine(dist);

            sw.Flush();
            sw.Close();
            sr.Close();
        }
    }
}
