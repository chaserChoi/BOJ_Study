using System;
using System.IO;
using System.Text;

class Program
{
    static void Main(string[] args)
    {
        using (StreamReader sr = new StreamReader(Console.OpenStandardInput()))
        using (StreamWriter sw = new StreamWriter(Console.OpenStandardOutput()) { AutoFlush = false })
        {
            int T = int.Parse(sr.ReadLine());

            for (int i = 1; i <= T; i++)
            {
                string[] input = sr.ReadLine().Split();
                long A = long.Parse(input[0]);
                long B = long.Parse(input[1]);

                long cnt = 0;
                long cubeRoot = (long)Math.Ceiling(Math.Pow(A, 1.0 / 3));

                while (cubeRoot * cubeRoot * cubeRoot <= B)
                {
                    if (cubeRoot * cubeRoot * cubeRoot >= A)
                        cnt++;
                    cubeRoot++;
                }

                sw.WriteLine($"Case #{i}: {cnt}");
            }

            sw.Close();
            sr.Close();
        }
    }
}
