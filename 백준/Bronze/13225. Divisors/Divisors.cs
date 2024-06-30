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
            int C = int.Parse(sr.ReadLine());
            for (int i = 0; i < C; i++)
            {
                int n = int.Parse(sr.ReadLine());
                int cnt = 0;
                for (int j = 1; j <= n; j++)
                {
                    if (n % j == 0)
                        cnt++;
                }
                sw.WriteLine($"{n} {cnt}");
            }

            sw.Flush();
            sw.Close();
            sr.Close();
        }
    }
}
