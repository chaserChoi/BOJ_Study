using System;
using System.IO;

class Program
{
    static void Main(string[] args)
    {
        using (var sr = new StreamReader(Console.OpenStandardInput()))
        using (var sw = new StreamWriter(Console.OpenStandardOutput()) { AutoFlush = true } )
        {
            int j = int.Parse(sr.ReadLine());
            long combinations = Combinations(j-1, 3);
            sw.WriteLine(combinations);
            sw.Flush();
        }
    }

    static long Combinations(int n, int k)
    {
        long result = 1;
        for (int i = 1; i <= k; i++)
        {
            result *= n--;
            result /= i;
        }
        return result;
    }
}
