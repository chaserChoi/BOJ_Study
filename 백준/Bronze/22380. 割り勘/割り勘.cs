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
            while (true)
            {
                string[] line = sr.ReadLine().Split();
                int n = int.Parse(line[0]);
                int m = int.Parse(line[1]);

                if (n == 0 && m == 0)
                    break;

                string[] line2 = sr.ReadLine().Split();
                int[] a = new int[n];
                for (int i = 0; i < n; i++)
                    a[i] = int.Parse(line2[i]);

                int amount = m / n;
                int total = 0;

                for (int i = 0; i < n; i++)
                {
                    if (a[i] >= amount)
                        total += amount;
                    else
                        total += a[i];
                }

                sw.WriteLine(total);
            }

            sw.Flush();
            sw.Close();
            sr.Close();
        }
    }
}
