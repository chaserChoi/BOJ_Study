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
            string[] line = sr.ReadLine().Split();
            int N = int.Parse(line[0]);
            int M = int.Parse(line[1]);

            int[] helmets = new int[N];
            int[] vests = new int[M];

            line = sr.ReadLine().Split();
            for (int i = 0; i < N; i++)
                helmets[i] = int.Parse(line[i]);

            line = sr.ReadLine().Split();
            for (int i = 0; i < M; i++)
                vests[i] = int.Parse(line[i]);

            int max = 0;
            for (int i = 0; i < N; i++)
            {
                for (int j = 0; j < M; j++)
                    max = Math.Max(max, helmets[i] + vests[j]);
            }

            sw.WriteLine(max);

            sw.Flush();
            sw.Close();
            sr.Close();
        }
    }
}
