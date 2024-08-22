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
            int r = int.Parse(line[0]);
            int f = int.Parse(line[1]);

            int total = (f + r / 2) / r;

            if (total % 2 == 0)
                sw.WriteLine("up");
            else
                sw.WriteLine("down");

            sw.Flush();
            sw.Close();
            sr.Close();
        }
    }
}
