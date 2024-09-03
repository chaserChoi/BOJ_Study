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
            double a = double.Parse(sr.ReadLine());

            double s = Math.Pow(2 * Math.Sqrt(a / Math.PI) + 2, 2);

            sw.WriteLine(s.ToString("F10", CultureInfo.InvariantCulture));

            sw.Flush();
            sw.Close();
            sr.Close();
        }
    }
}
