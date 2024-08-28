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
                int n = int.Parse(sr.ReadLine());
                if (n == 0) break;

                string[] times = sr.ReadLine().Split();
                int team = -1;
                int time = int.MaxValue;

                for (int i = 0; i < n; i++)
                {
                    int t = int.Parse(times[i]);
                    int diff = Math.Abs(t - 2023);

                    if (diff < time)
                    {
                        time = diff;
                        team = i + 1;
                    }
                }

                sw.WriteLine(team);
            }

            sw.Flush();
            sw.Close();
            sr.Close();
        }
    }
}
