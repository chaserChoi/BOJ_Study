using System;
using System.IO;
using System.Text;

class Program
{
    static void Main(string[] args) 
    {
        using (TextReader sr = new StreamReader(Console.OpenStandardInput()))
        using (TextWriter sw = new StreamWriter(Console.OpenStandardOutput()) { AutoFlush = false })
        {
            int P = int.Parse(sr.ReadLine());
            while (P-- > 0)
            {
                string[] input = sr.ReadLine().Split();
                int K = int.Parse(input[0]);
                int N = int.Parse(input[1]);
                int s1 = (N * (N + 1)) / 2;
                int s2 = N * N;
                int s3 = N * (N + 1);

                sw.WriteLine($"{K} {s1} {s2} {s3}");
            }

            sw.Flush();
            sw.Close();
            sr.Close();
        }
    }
}
