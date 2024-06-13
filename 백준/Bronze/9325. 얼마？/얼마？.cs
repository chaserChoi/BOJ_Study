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

            for (int i = 0; i < T; i++)
            {
                int carPrice = int.Parse(sr.ReadLine());
                int optionCnt = int.Parse(sr.ReadLine());

                for (int j = 0; j < optionCnt; j++)
                {
                    string[] input = sr.ReadLine().Split();
                    int q = int.Parse(input[0]);
                    int p = int.Parse(input[1]);
                    carPrice += q * p;
                }

                sw.WriteLine(carPrice);
            }

            sw.Close();
            sr.Close();
        }
    }
}
