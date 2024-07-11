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
            var line = sr.ReadLine().Split();
            int N = int.Parse(line[0]);
            int a = int.Parse(line[1]);
            int b = int.Parse(line[2]);
            int[,] X = new int[N, N];
            for (int i = 0; i < N; i++)
            {
                var row = sr.ReadLine().Split();
                for (int j = 0; j < N; j++)
                    X[i, j] = int.Parse(row[j]);
            }

            bool isAngry = false;
            for (int i = 0; i < N; i++) 
            {
                if (i == a - 1) continue;
                if (X[i, b - 1] > X[a - 1, b - 1])
                {
                    isAngry = true;
                    break;
                }
            }
            for (int j = 0; j < N; j++)
            {
                if (j == b - 1) continue;
                if (X[a - 1, j] > X[a - 1, b - 1])
                {
                    isAngry = true;
                    break;
                }
            }

            sw.WriteLine(isAngry ? "ANGRY" : "HAPPY");

            sw.Flush();
            sw.Close();
            sr.Close();
        }
    }
}
