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
            string lyrics = sr.ReadLine().Trim();

            Dictionary<char, int> dict = new Dictionary<char, int>();

            foreach (char c in lyrics)
            {
                if (char.IsLetter(c))
                {
                    char lower = char.ToLower(c);
                    if (dict.ContainsKey(lower))
                        dict[lower]++;
                    else 
                        dict[lower] = 1;
                }
            }

            int max = 0;
            foreach (var cnt in dict.Values)
            {
                if (cnt > max)
                    max = cnt;
            }

            sw.WriteLine(max);

            sw.Flush();
            sw.Close();
            sr.Close();
        }
    }
}
