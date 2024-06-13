using System;
using System.IO;

class Program
{
    static void Main(string[] args)
    {
        using (StreamReader sr = new StreamReader(Console.OpenStandardInput()))
        using (StreamWriter sw = new StreamWriter(Console.OpenStandardOutput()) { AutoFlush = false })
        {
            while (true)
            {
                int N = int.Parse(sr.ReadLine());
                if (N == 0) break;

                string[] input = sr.ReadLine().Split();
                int a1 = int.Parse(input[0]);
                int a2 = int.Parse(input[1]);
                int a3 = int.Parse(input[2]);

                if (a2 - a1 == a3 - a2)
                {
                    int d = a2 - a1;
                    sw.WriteLine((N * (2 * a1 + (N - 1) *d)) / 2);
                }
                else
                {
                    int r = a2 / a1;
                    sw.WriteLine((a1 * (int)Math.Pow(r, N) - a1) / (r - 1));
                }
            }

            sw.Close();
            sr.Close();
        }
    }
}
