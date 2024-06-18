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

            int A = 0, B = 0, C = 0;

            if (T % 10 != 0)
                sw.WriteLine("-1");
            else 
            {
                A = T / 300;
                T %= 300;
                B = T / 60;
                T %= 60;
                C = T / 10;

                sw.WriteLine($"{A} {B} {C}");
            }

            sw.Flush();
            sw.Close();
            sr.Close();
        }
    }
}
