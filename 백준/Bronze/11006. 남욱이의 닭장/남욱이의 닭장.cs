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
            int T = int.Parse(sr.ReadLine());

            for (int i = 0; i < T; i++)
            {
                string[] input = sr.ReadLine().Split();
                int N = int.Parse(input[0]);
                int M = int.Parse(input[1]);

                int U = 2 * M - N;
                int T2 = M - U;

                sw.WriteLine($"{U} {T2}");
            }

            sw.Flush();
            sw.Close();
            sr.Close();
        }
    }
}
