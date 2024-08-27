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
            var rings = Array.ConvertAll(sr.ReadLine().Split(), int.Parse);

            int total = 0;
            foreach (var r in rings)
                total += r;

            int max = 0;
            foreach (var r in rings)
            {
                if (r > max)
                    max = r;
            }

            int min = total - max;

            sw.WriteLine(min);

            sw.Flush();
            sw.Close();
            sr.Close();
        }
    }
}
