using System;
using System.IO;

class Program
{
    static void Main(string[] args)
    {
        using (TextReader sr = new StreamReader(Console.OpenStandardInput()))
        using (TextWriter sw = new StreamWriter(Console.OpenStandardOutput()) { AutoFlush = false })
        {
            Console.SetIn(sr);
            Console.SetOut(sw);

            int n = int.Parse(Console.ReadLine());
            int cyScore = 100;
            int sdScore = 100;

            for (int i = 0; i < n; i++)
            {
                string[] input = Console.ReadLine().Split();
                int cyDice = int.Parse(input[0]);
                int sdDice = int.Parse(input[1]);

                if (cyDice < sdDice)
                    cyScore -= sdDice;
                else if (cyDice > sdDice)
                    sdScore -= cyDice;
            }

            sw.WriteLine(cyScore);
            sw.WriteLine(sdScore);

            sw.Close();
            sr.Close();
        }
    }
}
