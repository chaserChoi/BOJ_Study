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
            int m = int.Parse(sr.ReadLine());
            int[] b = Array.ConvertAll(sr.ReadLine().Split(), int.Parse);

            int score = 0;

            var BSet = new HashSet<int>(b);

            for (int i = 0; i < n; i++)
            {
                score += a[i];

                if (BSet.Contains(score))
                    score = 0;
            }

            sw.WriteLine(score);

            sw.Flush();
            sw.Close();
            sr.Close();
        }
    }
}
