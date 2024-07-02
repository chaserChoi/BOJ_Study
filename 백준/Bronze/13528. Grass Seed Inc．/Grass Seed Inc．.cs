using System;
using System.IO;
using System.Text;

class Program
{
    static void Main(string[] args)
    {
        using (var sr = new StreamReader(Console.OpenStandardInput()))
        using (var sw = new StreamWriter(Console.OpenStandardOutput()))
        {
            double c = double.Parse(sr.ReadLine());
            int t = int.Parse(sr.ReadLine());
            double total = 0;

            while (t-- > 0)
            {
                string[] line = sr.ReadLine().Split();
                double w = double.Parse(line[0]);
                double l = double.Parse(line[1]);
                total += w * l * c;
            }

            sw.WriteLine(total.ToString("0.0000000"));

            sw.Flush();
            sw.Close();
            sr.Close();
        }
    }
}
