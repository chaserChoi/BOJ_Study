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
            string[] line = sr.ReadLine().Split();
            int n = int.Parse(line[0]);
            int c = int.Parse(line[1]);
            int total = c;

            for (int i = 0; i < n; i++)
            {
                string[] time = sr.ReadLine().Split(':');
                int m = int.Parse(time[0]);
                int s = int.Parse(time[1]);
                total += m * 60 + s - c;
            }

            int hs = total / 3600;
            int ms = (total % 3600) / 60;
            int ss = total % 60;
            sw.WriteLine($"{hs:D2}:{ms:D2}:{ss:D2}");

            sw.Flush();
            sw.Close();
            sr.Close();
        }
    }
}
