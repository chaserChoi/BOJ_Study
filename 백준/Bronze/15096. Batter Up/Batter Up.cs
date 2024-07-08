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
            int n = int.Parse(sr.ReadLine());
            string[] line = sr.ReadLine().Split();

            int bases = 0;
            int bats = 0;

            for (int i = 0; i < n; i++)
            {
                int hit = int.Parse(line[i]);
                if (hit >= 0)
                {
                    bases += hit;
                    bats++;
                }
            }

            double percent = (double)bases / bats;
            sw.WriteLine(percent.ToString("0.0000000000"));

            sw.Flush();
            sw.Close();
            sr.Close();
        }
    }
}
