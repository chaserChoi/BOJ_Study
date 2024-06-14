using System;
using System.IO;

class Program
{
    static void Main(string[] args)
    {
        using (StreamReader sr = new StreamReader(Console.OpenStandardInput()))
        using (StreamWriter sw = new StreamWriter(Console.OpenStandardOutput()) { AutoFlush = false })
        {
            int T = int.Parse(sr.ReadLine());

            for (int i = 0; i < T; i++)
            {
                string[] input = sr.ReadLine().Split();
                int N = int.Parse(input[0]);
                int D = int.Parse(input[1]);
                int cnt = 0;

                for (int j = 0; j < N; j++)
                {
                    input = sr.ReadLine().Split();
                    int v = int.Parse(input[0]);
                    int f = int.Parse(input[1]);
                    int c = int.Parse(input[2]);

                    double time = (double)D / v;
                    if (f >= time * c) 
                        cnt++;
                }

                sw.WriteLine(cnt);
            }

            sw.Close();
            sr.Close();
        }
    }
}
