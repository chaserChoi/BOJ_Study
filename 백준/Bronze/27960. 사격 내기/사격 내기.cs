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
            int sa = int.Parse(line[0]);
            int sb = int.Parse(line[1]);

            int score  = sa ^ sb;

            sw.WriteLine(score);

            sw.Flush();
            sw.Close();
            sr.Close();
        }
    }
}
