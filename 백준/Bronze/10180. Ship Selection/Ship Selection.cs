using System;
using System.IO;

class Program
{
    static void Main(string[] args)
    {
        using (TextReader sr = new StreamReader(Console.OpenStandardInput()))
        using (TextWriter sw = new StreamWriter(Console.OpenStandardOutput()) { AutoFlush = false })
        {
            int T = int.Parse(sr.ReadLine());

            for (int i = 0; i < T; i++)
            {
                string[] input = sr.ReadLine().Split();
                int N = int.Parse(input[0]);
                int D = int.Parse(input[1]);

                int ships = 0;

                for (int j = 0; j < N; j++)
                {
                    input = sr.ReadLine().Split();
                    int v = int.Parse(input[0]);
                    int f = int.Parse(input[1]);
                    int c = int.Parse(input[2]);

                    double dist = v * (double)f / c;

                    if (dist >= D)
                        ships++;
                }

                sw.WriteLine(ships);
            }

            sw.Flush();
            sw.Close();
            sr.Close();
        }
    }
}
