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
            while (true)
            {
                int y = int.Parse(sr.ReadLine());

                if (y == 0) break;

                if (y % 4 != 0 || y < 1896)
                    sw.WriteLine($"{y} No summer games");
                else if (y == 1916 || y == 1940 || y == 1944)
                    sw.WriteLine($"{y} Games cancelled");
                else if (y > 2020)
                    sw.WriteLine($"{y} No city yet chosen");
                else
                    sw.WriteLine($"{y} Summer Olympics");
            }

            sw.Flush();
            sw.Close();
            sr.Close();
        }
    }
}
