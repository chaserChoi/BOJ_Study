using System;
using System.IO;

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
                int d = int.Parse(sr.ReadLine());
                int max = 1;
                while (max + (max * max) <= d)
                    max++;

                sw.WriteLine(max - 1);
            }

            sw.Flush();
            sw.Close();
            sr.Close();
        }
    }
}
