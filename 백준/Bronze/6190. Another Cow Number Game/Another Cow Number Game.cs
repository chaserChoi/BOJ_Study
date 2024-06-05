using System;
using System.IO;

class Program
{
    static void Main()
    {
        using (var sr = new StreamReader(Console.OpenStandardInput()))
        using (var sw = new StreamWriter(Console.OpenStandardOutput()))
        {
            long N = long.Parse(sr.ReadLine());
            int score = 0;

            while (N != 1)
            {
                if (N % 2 == 0) 
                    N /= 2;
                else
                    N = N * 3 + 1;

                score++; 
            }

            sw.WriteLine(score); 
        }
    }
}
