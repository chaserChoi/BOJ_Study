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
            int N = int.Parse(sr.ReadLine());

            for (int i = 0; i < N; i++) 
            {
                for (int j = 0; j < N - i - 1; j++)
                    sw.Write(" ");

                if (i == 0)
                    sw.WriteLine("*");
                else if (i == N - 1)
                {
                    for (int j = 0; j < 2 * i + 1; j++)
                        sw.Write("*");
                    sw.WriteLine();
                } else 
                {
                    sw.Write("*");
                    for (int j = 0; j < 2 * i - 1; j++)
                        sw.Write(" ");
                    sw.WriteLine("*");
                }
            }

            sw.Flush();
            sw.Close();
            sr.Close();
        }
    }
}
