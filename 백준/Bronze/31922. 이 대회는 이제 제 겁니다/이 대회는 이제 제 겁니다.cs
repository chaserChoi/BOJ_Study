using System;
using System.IO;

class Program
{
    static void Main(string[] args)
    {
        using (var sr = new StreamReader(Console.OpenStandardInput()))
        using (var sw = new StreamWriter(Console.OpenStandardOutput()) { AutoFlush = true } )
        {
            string[] input = sr.ReadLine().Split(' ');
            int A = int.Parse(input[0]);
            int P = int.Parse(input[1]);
            int C = int.Parse(input[2]);

            int maxPrize = Math.Max(A + C, P);

            sw.WriteLine(maxPrize);
            sw.Flush();
        }
    }
}
