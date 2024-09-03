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
            int n = int.Parse(sr.ReadLine());
            string s = sr.ReadLine();
            

            Dictionary<char, int> dict = new Dictionary<char, int>();
            foreach (char c in s)
            {
                if (dict.ContainsKey(c))
                    dict[c]++;
                else
                    dict[c] = 1;
            }

            int cntU = dict.ContainsKey('u') ? dict['u'] : 0;
            int cntO = dict.ContainsKey('o') ? dict['o'] : 0;
            int cntS = dict.ContainsKey('s') ? dict['s'] : 0;
            int cntP = dict.ContainsKey('p') ? dict['p'] : 0;
            int cntC = dict.ContainsKey('c') ? dict['c'] : 0;

            int max = Math.Min(cntU, Math.Min(cntO, Math.Min(cntS, Math.Min(cntP, cntC))));

            sw.WriteLine(max);

            sw.Flush();
            sw.Close();
            sr.Close();
        }
    }
}
