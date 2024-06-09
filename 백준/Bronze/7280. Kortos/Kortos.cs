using System;
using System.IO;

class Program
{
    static void Main(string[] args)
    {
        using (StreamReader sr = new StreamReader(Console.OpenStandardInput()))
        using (StreamWriter sw = new StreamWriter(Console.OpenStandardOutput()) { AutoFlush = false })
        {
            var suits = new List<string> { "S", "B", "V", "K" };
            var cards = new Dictionary<string, HashSet<int>>();
            foreach (var suit in suits)
            {
                cards[suit] = new HashSet<int>();
                for (int i = 1; i <= 13; i++) 
                    cards[suit].Add(i);
            }

            for (int i = 0; i < 51; i++)
            {
                string[] input = sr.ReadLine().Split();
                string suit = input[0];
                int value = int.Parse(input[1]);
                cards[suit].Remove(value);
            }
            
            foreach (var suit in suits)
            {
                if (cards[suit].Count > 0)
                {
                    foreach (var value in cards[suit])
                    {
                        sw.WriteLine($"{suit} {value}");
                        break;
                    }
                    break;
                }
            }

            sr.Close();
            sw.Close();
        }
    }
}