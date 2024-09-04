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
            int n = int.Parse(sr.ReadLine().Trim());

            long jinju = 0;
            int cnt = 0;

            var map = new Dictionary<long, int>();

            for (int i = 0; i < n; i++)
            {
                string[] line = sr.ReadLine().Trim().Split();
                string dest = line[0];
                long c = long.Parse(line[1]);

                if (dest == "jinju")
                    jinju = c;
                else if (c > 1000)
                    cnt++; 
                else
                {
                    if (map.ContainsKey(c))
                        map[c]++;
                    else
                        map[c] = 1;
                    
                }
            }

            foreach (var kvp in map)
            {
                if (kvp.Key > jinju)
                    cnt += kvp.Value;
            }

            sw.WriteLine(jinju);
            sw.WriteLine(cnt);

            sw.Flush();
            sw.Close();
            sr.Close();
        }
    }
}
