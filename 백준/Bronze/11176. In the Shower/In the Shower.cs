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
                int E = int.Parse(input[0]);
                int N = int.Parse(input[1]);
                int empty = 0;
                for (int j = 0; j < N; j++)
                {
                    int attempts = int.Parse(sr.ReadLine());
                    if (attempts > E)
                        empty++;
                }

                sw.WriteLine(empty);
            }

            sw.Flush();
            sw.Close();
            sr.Close();
        }
    }
}
