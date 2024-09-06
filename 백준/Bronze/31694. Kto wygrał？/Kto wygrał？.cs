using System;
using System.Globalization;
using System.IO;
using System.Text;

class Program
{
    static void Main(string[] args)
    {
        using (var sr = new StreamReader(Console.OpenStandardInput()))
        using (var sw = new StreamWriter(Console.OpenStandardOutput()) { AutoFlush = true })
        {
            int[] algosia = new int[18];
            int[] bajtek = new int[18];

            string[] input = sr.ReadLine().Split();
            for (int i = 0; i < 18; i++)
                algosia[i] = int.Parse(input[i]);

            input = sr.ReadLine().Split();
            for (int i = 0; i < 18; i++)
                bajtek[i] = int.Parse(input[i]);

            int alTotal = 0;
            int bajTotal = 0;

            int[] alCnt = new int[11];
            int[] bajCnt = new int[11];

            for (int i = 0; i < 18; i++)
            {
                alTotal += algosia[i];
                bajTotal += bajtek[i];
                alCnt[algosia[i]]++;
                bajCnt[bajtek[i]]++;
            }

            if (alTotal > bajTotal)
            {
                sw.WriteLine("Algosia");
                return;
            }
            else if (bajTotal > alTotal)
            {
                sw.WriteLine("Bajtek");
                return;
            }

            for (int i = 10; i >= 0; i--)
            {
                if (alCnt[i] > bajCnt[i])
                {
                    sw.WriteLine("Algosia");
                    return;
                }
                else if (bajCnt[i] > alCnt[i])
                {
                    sw.WriteLine("Bajtek");
                    return;
                }
            }

            sw.WriteLine("remis");

            sw.Flush();
            sw.Close();
            sr.Close();
        }
    }
}
