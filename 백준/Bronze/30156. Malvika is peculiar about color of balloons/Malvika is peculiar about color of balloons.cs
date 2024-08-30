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
            int t = int.Parse(sr.ReadLine());

            string[] ans = new string[t];

            for (int i = 0; i < t; i++)
            {
                string s = sr.ReadLine();

                int cntA = 0, cntB = 0;
                foreach (char c in s)
                {
                    if (c == 'a')
                        cntA++;
                    else
                        cntB++;
                }

                ans[i] = Math.Min(cntA, cntB).ToString();
            }

            sw.WriteLine(string.Join(Environment.NewLine, ans));

            sw.Flush();
            sw.Close();
            sr.Close();
        }
    }
}
