using System;
using System.Collections.Generic;
using System.IO;

class Program
{
    static void Main()
    {
        using (var sr = new StreamReader(Console.OpenStandardInput()))
        using (var sw = new StreamWriter(Console.OpenStandardOutput()))
        {
            string[] inputs = sr.ReadLine().Split();
            int P = int.Parse(inputs[0]);
            int Q = int.Parse(inputs[1]);

            List<int> factorsP = FindFactors(P);
            List<int> factorsQ = FindFactors(Q);

            foreach (int fp in factorsP)
            {
                foreach (int fq in factorsQ)
                    sw.WriteLine($"{fp} {fq}");
            }
        }
    }

    static List<int> FindFactors(int num)
    {
        List<int> factors = new List<int>();
        for (int i = 1; i <= num; i++)
        {
            if (num % i == 0)
                factors.Add(i); 
        }

        return factors;
    }
}
