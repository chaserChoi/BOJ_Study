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
            double total = 0.0;

            for (int i = 0; i < n; i++)
            {
                string[] line = sr.ReadLine().Split();
                double q = double.Parse(line[0]);
                double y = double.Parse(line[1]);

                total += q * y;
            }

            sw.WriteLine(total.ToString("F3"));

            sw.Flush();
            sw.Close();
            sr.Close();
        }
    }
}
