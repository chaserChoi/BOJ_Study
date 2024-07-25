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
            string[] line = sr.ReadLine().Split();
            int a = int.Parse(line[0]);
            int b = int.Parse(line[1]);
            int c = int.Parse(line[2]);

            int max = (a % 2 == 1 || b % 2 == 1 || c % 2 == 1) ? ((a % 2 == 1 ? a : 1) * (b % 2 == 1 ? b : 1) * (c % 2 == 1 ? c : 1)) : (a * b * c);

            sw.WriteLine(max);

            sw.Flush();
            sw.Close();
            sr.Close();
        }
    }
}
