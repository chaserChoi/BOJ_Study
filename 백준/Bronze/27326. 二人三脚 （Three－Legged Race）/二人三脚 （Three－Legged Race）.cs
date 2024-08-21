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
            int[] a = Array.ConvertAll(sr.ReadLine().Split(), int.Parse);

            int[] cnt = new int[n + 1];

            foreach (var g in a)
                cnt[g]++;

            for (int i = 1; i <= n; i++)
            {
                if (cnt[i] < 2)
                {
                    sw.WriteLine(i);
                    break;
                }
            }

            sw.Flush();
            sw.Close();
            sr.Close();
        }
    }
}
