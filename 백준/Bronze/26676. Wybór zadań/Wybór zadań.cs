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
            string[] str = sr.ReadLine().Split();

            Dictionary<string, int> dict = new Dictionary<string, int>
            {
                { "1A", 1 }, { "1B", 1 }, { "1C", 1 },
                { "2A", 1 }, { "2B", 1 }, { "2C", 1 },
                { "3A", 1 }, { "3B", 1 }, { "3C", 1 },
                { "4A", 1 }, { "4B", 1 }, { "4C", 1 },
                { "5A", 2 }, { "5B", 2 }, { "5C", 2 },
            };

            Dictionary<string, int> cnt = new Dictionary<string, int>();

            foreach (var s in str)
            {
                if (!cnt.ContainsKey(s))
                    cnt[s] = 0;

                cnt[s]++;
            }

            foreach (var pos in dict.Keys)
            {
                if (!cnt.ContainsKey(pos) || cnt[pos] < dict[pos])
                {
                    sw.WriteLine("NIE");
                    return;
                }
            }

            sw.WriteLine("TAK");

            sw.Flush();
            sw.Close();
            sr.Close();
        }
    }
}
