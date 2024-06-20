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
                string[] input = sr.ReadLine().Split();
                int v = int.Parse(input[0]);
                int e = int.Parse(input[1]);
                sw.WriteLine(e - v + 2);
            }

            sw.Flush();
            sw.Close();
            sr.Close();
        }
    }
}
