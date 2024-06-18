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
                int c = int.Parse(input[0]);
                int v = int.Parse(input[1]);

                int share = c / v;
                int remainder = c % v;

                sw.WriteLine($"You get {share} piece(s) and your dad gets {remainder} piece(s).");
            }

            sw.Flush();
            sw.Close();
            sr.Close();
        }
    }
}
