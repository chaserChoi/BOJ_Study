using System;
using System.IO;

class Program
{
    static void Main(string[] args)
    {
        using (StreamReader sr = new StreamReader(Console.OpenStandardInput()))
        using (StreamWriter sw = new StreamWriter(Console.OpenStandardOutput()) { AutoFlush = false })
        {
            var happinessInput = sr.ReadLine().Split().Select(int.Parse).ToArray();
            int milkHappiness = happinessInput[0];
            int honeyHappiness = happinessInput[1];

            int fieldCnt = int.Parse(sr.ReadLine());
            int totalHappiness = 0;

            for (int i = 0; i < fieldCnt; i++)
            {
                var capacities = sr.ReadLine().Split().Select(int.Parse).ToArray();
                int cowCapacity = capacities[0];
                int beeCapacity = capacities[1];

                int cowHappiness = cowCapacity * milkHappiness;
                int beeHappiness = beeCapacity * honeyHappiness;

                totalHappiness += Math.Max(cowHappiness, beeHappiness);
            }

            sw.WriteLine(totalHappiness);
        }
    }
}