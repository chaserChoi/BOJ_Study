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
            double k = double.Parse(sr.ReadLine());
            string[] line = sr.ReadLine().Split();
            double d1 = double.Parse(line[0]);
            double d2 = double.Parse(line[1]);

            sw.WriteLine(k * k - (d1 - d2) * (d1 - d2) / 4.0);

            sw.Flush();
            sw.Close();
            sr.Close();
        }
    }
}
