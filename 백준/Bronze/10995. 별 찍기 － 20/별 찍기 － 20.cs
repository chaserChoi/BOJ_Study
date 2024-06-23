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
                if (i % 2 == 0)
                {
                    for (int j = 0; j < N; j++)
                        sw.Write("* ");
                } else 
                {
                    sw.Write(" ");
                    for (int j = 0; j < N; j++)
                        sw.Write("* ");
                }
                sw.WriteLine();
            }

            sw.Flush();
            sw.Close();
            sr.Close();
        }
    }
}
