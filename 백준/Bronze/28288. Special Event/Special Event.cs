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
            int[] cnts = new int[5];

            for (int i = 0; i < n; i++)
            {
                string avail = sr.ReadLine();
                for (int j = 0; j < 5; j++)
                {
                    if (avail[j] == 'Y')
                        cnts[j]++;
                }
            }

            int max = 0;
            for (int i = 0; i < 5; i++)
            {
                if (cnts[i] > max)
                    max = cnts[i];
            }

            var ans = new List<int>();
            for (int i = 0; i < 5; i++)
            {
                if (cnts[i] == max)
                    ans.Add(i + 1);
            }

            sw.WriteLine(string.Join(",", ans));

            sw.Flush();
            sw.Close();
            sr.Close();
        }
    }
}
