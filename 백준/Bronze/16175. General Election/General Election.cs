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

            while (T-- > 0)
            {
                string[] line = sr.ReadLine().Split();
                int N = int.Parse(line[0]);
                int M = int.Parse(line[1]);

                int[] votes = new int[N];
                for (int i = 0; i < M; i++) 
                {
                    line = sr.ReadLine().Split();
                    for (int j = 0; j < N; j++)
                        votes[j] += int.Parse(line[j]);
                }

                int winnerIdx = 0;
                int max = votes[0];
                for (int i = 1; i < N; i++)
                {
                    if (votes[i] > max)
                    {
                        winnerIdx = i;
                        max = votes[i];
                    }
                }

                sw.WriteLine(winnerIdx + 1);
            }

            sw.Flush();
            sw.Close();
            sr.Close();
        }
    }
}
