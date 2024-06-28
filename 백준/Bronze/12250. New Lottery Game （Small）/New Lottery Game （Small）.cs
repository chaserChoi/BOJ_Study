using System;
using System.IO;

class Program
{
    static void Main(string[] args)
    {
        using (var sr = new StreamReader(Console.OpenStandardInput()))
        using (var sw = new StreamWriter(Console.OpenStandardOutput()))
        {
            int T = int.Parse(sr.ReadLine());

            for (int i = 1; i <= T; i++)
            {
                string[] input = sr.ReadLine().Split();
                int A = int.Parse(input[0]);
                int B = int.Parse(input[1]);
                int K = int.Parse(input[2]);

                int cnt = 0;
                for (int x = 0; x < A; x++)
                {
                    for (int y = 0; y < B; y++)
                        if ((x & y) < K)
                            cnt++;
                }

                sw.WriteLine($"Case #{i}: {cnt}");
            }

            sw.Flush();
            sw.Close();
            sr.Close();
        }
    }
}
