using System;
using System.IO;

class Program
{
    static void Main()
    {
        using (var sr = new StreamReader(Console.OpenStandardInput()))
        using (var sw = new StreamWriter(Console.OpenStandardOutput()))
        {
            int N = int.Parse(sr.ReadLine()); 
            int cnt = 0; 

            for (int A = 1; A <= 500; A++) 
            {
                for (int B = 1; B <= A; B++) 
                {
                    if (A * A == B * B + N) 
                        cnt++; 
                }
            }

            sw.WriteLine(cnt);
        }
    }
}
