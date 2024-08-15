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
            string[] line = sr.ReadLine().Split();
            int[] outcomes = new int[n];

            for (int i = 0; i < n; i++)
                outcomes[i] = int.Parse(line[i]);

            Dictionary<int, int> cnt = new Dictionary<int, int>();

            for (int i = 0; i < n; i++)
            {
                if (cnt.ContainsKey(outcomes[i]))
                    cnt[outcomes[i]]++;
                else
                    cnt[outcomes[i]] = 1;
            }

            int high = -1;
            int winner = -1;

            for (int i = 0; i < n; i++)
            {
                if (cnt[outcomes[i]] == 1)
                {
                    if (outcomes[i] > high)
                    {
                        high = outcomes[i];
                        winner = i + 1;
                    }
                }
            }

            if (winner == -1)
                sw.WriteLine("none");
            else
                sw.WriteLine(winner);

            sw.Flush();
            sw.Close();
            sr.Close();
        }
    }
}
