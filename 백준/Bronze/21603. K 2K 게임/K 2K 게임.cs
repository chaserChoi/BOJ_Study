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
            string[] line = sr.ReadLine().Split();
            int n = int.Parse(line[0]);
            int k = int.Parse(line[1]);

            int lastK = k % 10;
            int last2K = (2 * k) % 10;

            List<int> ans = new List<int>();

            for (int i = 1; i <= n; i++)
            {
                int lastX = i % 10;

                if (lastX != lastK && lastX != last2K)
                    ans.Add(i);
            }

            sw.WriteLine(ans.Count);
            if (ans.Count > 0)
                sw.WriteLine(string.Join(" ", ans));
            else
                sw.WriteLine();

            sw.Flush();
            sw.Close();
            sr.Close();
        }
    }
}
