using System;
using System.IO;
using System.Text;

class Program
{
    static void Main(string[] args)
    {
        using (var sr = new StreamReader(Console.OpenStandardInput()))
        using (var sw = new StreamWriter(Console.OpenStandardOutput()) { AutoFlush = true })
        {
            int n = int.Parse(sr.ReadLine());
            
            for (int i = 0; i < n; i++)
            {
                string[] cards = sr.ReadLine().Split();
                Dictionary<char, int> rank = new Dictionary<char, int>();

                foreach (var card in cards)
                {
                    char r = card[0];
                    if (rank.ContainsKey(r))
                        rank[r]++;
                    else
                        rank[r] = 1;
                }

                int max = 0;
                foreach (var cnt in rank.Values)
                {
                    if (cnt > max)
                        max = cnt;
                }

                sw.WriteLine(max);
            }

            sw.Flush();
            sw.Close();
            sr.Close();
        }
    }
}
