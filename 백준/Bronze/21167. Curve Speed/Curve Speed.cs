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
            string line;
            while ((line = sr.ReadLine()) != null)
            {
                string[] line2 = line.Split();
                int r = int.Parse(line2[0]);
                double s = double.Parse(line2[1], CultureInfo.InvariantCulture);

                double v = Math.Sqrt((r * (s + 0.16)) / 0.067);

                sw.WriteLine(Math.Round(v));
            }

            sw.Flush();
            sw.Close();
            sr.Close();
        }
    }
}
