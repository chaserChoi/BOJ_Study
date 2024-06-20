using System;
using System.IO;

class Program
{
    static void Main(string[] args)
    {
        using (TextReader sr = new StreamReader(Console.OpenStandardInput()))
        using (TextWriter sw = new StreamWriter(Console.OpenStandardOutput()) { AutoFlush = false })
        {
            while (true)
            {
                string[] input = sr.ReadLine().Split();
                int a = int.Parse(input[0]);
                int b = int.Parse(input[1]);
                int c = int.Parse(input[2]);
                int d = int.Parse(input[3]);

                if (a == 0 && b == 0 && c == 0 && d == 0)
                    break;

                int min = c - b;
                int max = d - a;

                sw.WriteLine($"{min} {max}");
            }

            sw.Flush();
            sw.Close();
            sr.Close();
        }
    }
}
