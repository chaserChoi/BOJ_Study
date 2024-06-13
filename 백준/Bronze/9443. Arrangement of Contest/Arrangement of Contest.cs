using System;
using System.IO;

class Program
{
    static void Main(string[] args)
    {
        using (StreamReader sr = new StreamReader(Console.OpenStandardInput()))
        using (StreamWriter sw = new StreamWriter(Console.OpenStandardOutput()) { AutoFlush = false })
        {
            int n = int.Parse(sr.ReadLine());
            HashSet<char> ans = new HashSet<char>();

            for (int i = 0; i < n; i++)
            {
                string s = sr.ReadLine();
                ans.Add(s[0]);
            }

            string alpha = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
            int idx = 0;

            while (idx < 26)
            {
                if (!ans.Contains(alpha[idx % 26])) break;
                idx++;
            }

            sw.WriteLine(idx);

            sw.Close();
            sr.Close();
        }
    }
}
