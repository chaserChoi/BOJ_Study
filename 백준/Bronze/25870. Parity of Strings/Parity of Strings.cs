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
            string line = sr.ReadLine();
            
            int[] freq = new int[26];

            foreach (char c in line)
                freq[c - 'a']++;

            int odd = 0, even = 0;
            
            foreach (int cnt in freq)
            {
                if (cnt == 0)
                    continue;
                if (cnt % 2 != 0)
                    odd++;
                else 
                    even++;
            }

            if (odd == 0 && even > 0)
                sw.WriteLine(0);
            else if (odd > 0 && even == 0)
                sw.WriteLine(1);
            else
                sw.WriteLine(2);

            sw.Flush();
            sw.Close();
            sr.Close();
        }
    }
}
