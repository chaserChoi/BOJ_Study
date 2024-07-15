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
            int c = int.Parse(line[0]);
            int k = int.Parse(line[1]);
            int p = int.Parse(line[2]);

            sw.WriteLine(c * (c + 1) * (3 * k + p * (2 * c + 1)) / 6);

            sw.Flush();
            sw.Close();
            sr.Close();
        }
    }
}
