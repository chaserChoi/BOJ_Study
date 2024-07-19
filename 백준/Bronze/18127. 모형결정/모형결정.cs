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
            long a = long.Parse(line[0]);
            long b = long.Parse(line[1]);

            sw.WriteLine((b + 1) * ((a - 2) * b + 2) / 2);

            sw.Flush();
            sw.Close();
            sr.Close();
        }
    }
}
