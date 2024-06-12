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

            for (int t = 1; t <= T; t++)
            {
                string[] input = sr.ReadLine().Split();
                int dice1 = int.Parse(input[0]);
                int dice2 = int.Parse(input[1]);
                int sum = dice1 + dice2;

                sw.WriteLine($"Case {t}: {sum}");
            }

            sw.Close();
            sr.Close();
        }
    }
}