using System;
using System.IO;

class Program
{
    static void Main(string[] args)
    {
        using (TextReader sr = new StreamReader(Console.OpenStandardInput()))
        using (TextWriter sw = new StreamWriter(Console.OpenStandardOutput()) { AutoFlush = false })
        {
            string[] input = sr.ReadLine().Split();
            int W = int.Parse(input[0]);
            int N = int.Parse(input[1]);
            int P = int.Parse(input[2]);

            input = sr.ReadLine().Split();

            int fair = 0;
            for (int i = 0; i < P; i++)
            {
                int height = int.Parse(input[i]);

                if (height >= W && height <= N)
                    fair++;
            }

            sw.WriteLine(fair);

            sw.Flush();
            sw.Close();
            sr.Close();
        }
    }
}
