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
            int N = int.Parse(sr.ReadLine());
            int cnt = 0;

            for (int i = 1; i <= N - 2; i++)
            {
                if (i % 2 == 1) continue;
                for (int j = 1; i + j <= N - 1; j++)
                    if (N - i - j >= j + 2) cnt++;
            }

            sw.WriteLine(cnt);

            sw.Flush();
            sw.Close();
            sr.Close();
        }
    }
}
