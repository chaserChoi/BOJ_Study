using System;
using System.Globalization;
using System.IO;
using System.Text;

class Program
{
    static void Main(string[] args)
    {
        using (var sr = new StreamReader(Console.OpenStandardInput()))
        using (var sw = new StreamWriter(Console.OpenStandardOutput()) { AutoFlush = true })
        {
            while (true)
            {
                string line = sr.ReadLine();
                if (line == "#") break;

                string[] parts = line.Split();
                string g = parts[0];
                int y = int.Parse(parts[1]);
                int m = int.Parse(parts[2]);
                int d = int.Parse(parts[3]);

                if (y >= 32 || (y == 31 && m >= 5))
                    sw.Write($"? {y - 30} ");
                else 
                    sw.Write($"{g} {y} ");

                sw.WriteLine($"{m} {d}");
            }

            sw.Flush();
            sw.Close();
            sr.Close();
        }
    }
}
