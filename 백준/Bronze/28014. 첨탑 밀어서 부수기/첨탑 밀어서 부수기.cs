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
            string[] line = sr.ReadLine().Split();
            int[] h = new int[n];

            for (int i = 0; i < n; i++)
                h[i] = int.Parse(line[i]);

            int cnt = 1;
            for (int i = 1; i < n; i++)
            {
                if (h[i - 1] <= h[i])
                    cnt++;
            }

            sw.WriteLine(cnt);

            sw.Flush();
            sw.Close();
            sr.Close();
        }
    }
}
