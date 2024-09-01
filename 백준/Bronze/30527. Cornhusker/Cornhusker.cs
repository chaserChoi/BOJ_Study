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
            int[] kernels = Array.ConvertAll(line, int.Parse);

            string[] line2 = sr.ReadLine().Split();
            int n = int.Parse(line2[0]);
            int kwf = int.Parse(line2[1]);

            long total = 0;
            for (int i = 0; i < 5; i++)
            {
                int a = kernels[i * 2];
                int l = kernels[i * 2 + 1];
                total += (long)a * l;
            }

            long avg = total / 5;
            long totalSection = avg * n;
            long ans = totalSection / kwf;

            sw.WriteLine(ans);

            sw.Flush();
            sw.Close();
            sr.Close();
        }
    }
}
