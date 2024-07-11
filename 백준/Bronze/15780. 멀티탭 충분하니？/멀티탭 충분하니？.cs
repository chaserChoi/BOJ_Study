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
            int K = int.Parse(line[1]);

            string[] line2 = sr.ReadLine().Split();
            int[] A = new int[K];
            for (int i = 0; i < K; i++)
                A[i] = int.Parse(line2[i]);

            int sum = 0;
            for (int i = 0; i < K; i++)
                sum += (A[i] + 1) / 2;

            sw.WriteLine(sum >= N ? "YES" : "NO");

            sw.Flush();
            sw.Close();
            sr.Close();
        }
    }
}
