using System;
using System.IO;
using System.Numerics;

class Program
{
    static void Main(string[] args)
    {
        using (StreamReader sr = new StreamReader(Console.OpenStandardInput()))
        using (StreamWriter sw = new StreamWriter(Console.OpenStandardOutput()))
        {
            int n = int.Parse(sr.ReadLine());
            for (int i = 0; i < n; i++)
            {
                if (i > 0) sw.WriteLine();

                BigInteger dividend = BigInteger.Parse(sr.ReadLine());
                BigInteger divisor = BigInteger.Parse(sr.ReadLine());

                BigInteger q = dividend / divisor;
                BigInteger r = dividend % divisor;

                sw.WriteLine(q.ToString());
                sw.WriteLine(r.ToString());
            }

            sw.Flush();
        }
    }
}