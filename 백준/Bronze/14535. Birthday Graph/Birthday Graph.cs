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
            int T = 1;
            string[] m = { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };
            while (true) {
                int N = int.Parse(sr.ReadLine());
                if (N == 0) break;

                int[] monthCnt = new int[12];
                for (int i = 0; i < N; i++)
                {
                    string[] date = sr.ReadLine().Split();
                    int day = int.Parse(date[0]);
                    int month = int.Parse(date[1]) - 1;
                    monthCnt[month]++;
                }

                sw.WriteLine($"Case #{T}:");
                for (int i = 0; i < 12; i++)
                {
                    sw.Write($"{m[i]}:");
                    for (int j = 0; j < monthCnt[i]; j++)
                        sw.Write('*');
                    sw.WriteLine();
                }
                T++;
            }

            sw.Flush();
            sw.Close();
            sr.Close();
        }
    }
}
