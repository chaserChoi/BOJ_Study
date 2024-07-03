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
            while (true) 
            {
                int K = int.Parse(sr.ReadLine());
                if (K == 0) break;

                string[] line = sr.ReadLine().Split();
                int N = int.Parse(line[0]);
                int M = int.Parse(line[1]);

                for (int i = 0; i < K; i++)
                {
                    line = sr.ReadLine().Split();
                    int X = int.Parse(line[0]);
                    int Y = int.Parse(line[1]);

                    if (X == N || Y == M)
                        sw.WriteLine("divisa");
                    else if (X < N && Y > M)
                        sw.WriteLine("NO");
                    else if (X > N && Y > M)
                        sw.WriteLine("NE");
                    else if (X > N && Y < M)
                        sw.WriteLine("SE");
                    else 
                        sw.WriteLine("SO");
                }
            }

            sw.Flush();
            sw.Close();
            sr.Close();
        }
    }
}
