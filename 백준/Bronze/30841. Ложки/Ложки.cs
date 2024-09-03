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
            long a = long.Parse(line[0]);
            long b = long.Parse(line[1]);

            sw.WriteLine((a == 0 || b == 0) ? 0 : (a * b) / (a + b));

            sw.Flush();
            sw.Close();
            sr.Close();
        }
    }
}
