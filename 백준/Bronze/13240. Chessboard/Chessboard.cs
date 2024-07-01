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
            string[] input = sr.ReadLine().Split();
            int N = int.Parse(input[0]);
            int M = int.Parse(input[1]);

            for (int i = 0; i < N; i++)
            {
                for (int j = 0; j < M; j++)
                    sw.Write(((i + j) & 1) != 0 ? "." : "*");
                sw.WriteLine();
            }

            sw.Flush();
            sw.Close();
            sr.Close();
        }
    }
}
