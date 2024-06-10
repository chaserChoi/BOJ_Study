using System;
using System.IO;

class Program
{
    static void Main(string[] args)
    {
        using (StreamReader sr = new StreamReader(Console.OpenStandardInput()))
        using (StreamWriter sw = new StreamWriter(Console.OpenStandardOutput()) { AutoFlush = false })
        {
            int n = int.Parse(sr.ReadLine());
            string[] inputs = sr.ReadLine().Split();
            int cntHeads = 0;
            int cntTails = 0;

            for (int i = 0; i < n; i++)
            {
                if (inputs[i] == "0")
                    cntHeads++;
                else
                    cntTails++;
            }

            int minFlips = Math.Min(cntHeads, cntTails);

            sw.WriteLine(minFlips);

            sr.Close();
            sw.Close();
        }
    }
}