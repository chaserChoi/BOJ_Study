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
            int T = int.Parse(sr.ReadLine());

            for (int i = 0; i < T; i++)
            {
                int N = int.Parse(sr.ReadLine());

                int s1 = (N * (N + 1)) / 2;
                int s2 = (N * N);
                int s3 = (N * (N + 1));

                sw.WriteLine($"{s1} {s2} {s3}");
            }

            sw.Flush();
            sw.Close();
            sr.Close();
        }
    }
}
