using System;
using System.IO;

class Program
{
    static void Main(string[] args)
    {
        using (StreamReader sr = new StreamReader(Console.OpenStandardInput()))
        using (StreamWriter sw = new StreamWriter(Console.OpenStandardOutput()) { AutoFlush = false })
        {
            int T = int.Parse(sr.ReadLine());

            for (int t = 1; t <= T; t++)
            {
                string first = sr.ReadLine();
                string last = sr.ReadLine();
                sw.WriteLine($"Case {t}: {last}, {first}");
            }

            sw.Close();
            sr.Close();
        }
    }
}
