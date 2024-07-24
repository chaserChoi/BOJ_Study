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
            for (int i = 0; i < n; i++)
            {
                string[] line = sr.ReadLine().Split();
                double p = double.Parse(line[0], CultureInfo.InvariantCulture);
                double c = double.Parse(line[1], CultureInfo.InvariantCulture);

                double o = p / (1 + c / 100.0);

                sw.WriteLine(o.ToString("F9", CultureInfo.InvariantCulture));
            }

            sw.Flush();
            sw.Close();
            sr.Close();
        }
    }
}
