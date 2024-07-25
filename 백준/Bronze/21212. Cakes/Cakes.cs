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
            int n = int.Parse(sr.ReadLine());

            int max = int.MaxValue;

            for (int i = 0; i < n; i++)
            {
                var line = sr.ReadLine().Split();
                int re = int.Parse(line[0]);
                int avail = int.Parse(line[1]);

                int pos = avail / re;

                if (pos < max)
                    max = pos;
            }

            sw.WriteLine(max);

            sw.Flush();
            sw.Close();
            sr.Close();
        }
    }
}
