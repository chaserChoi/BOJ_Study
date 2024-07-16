using System;
using System.IO;

class Program
{
    static void Main(string[] args)
    {
        using (var sr = new StreamReader(Console.OpenStandardInput()))
        using (var sw = new StreamWriter(Console.OpenStandardOutput()) { AutoFlush = true } )
        {
            int N = int.Parse(sr.ReadLine());
            string[] line = sr.ReadLine().Split();
            int[] A = new int[N];
            for (int i = 0; i < N; i++)
                A[i] = int.Parse(line[i]);

            Array.Sort(A);
            sw.WriteLine(A[N - 1]);

            sw.Flush();
            sw.Close();
            sr.Close();
        }
    }
}
