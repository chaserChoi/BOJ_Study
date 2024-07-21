using System;
using System.IO;
using System.Text;

class Program
{
    static void Main(string[] args)
    {
        using (var sr = new StreamReader(Console.OpenStandardInput()))
        using (var sw = new StreamWriter(Console.OpenStandardOutput()) { AutoFlush = true })
        {
            string[] line1 = sr.ReadLine().Split();
            int m = int.Parse(line1[0]);
            int n = int.Parse(line1[1]);

            bool[] covered = new bool[m + 1];

            for (int i = 0; i < n; i++)
            {
                string[] line2 = sr.ReadLine().Split();
                int l = int.Parse(line2[0]);
                int r = int.Parse(line2[1]);

                for (int j = l; j <= r; j++)
                    covered[j] = true;
            }

            bool allCovered = true;
            for (int i = 1; i <= m; i++)
            {
                if (!covered[i])
                {
                    allCovered = false;
                    break;
                }
            }

            sw.WriteLine(allCovered ? "YES" : "NO");

            sw.Flush();
            sw.Close();
            sr.Close();
        }
    }
}
