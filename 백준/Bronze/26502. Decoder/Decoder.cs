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

            char[] o = { 'a', 'e', 'i', 'o', 'u', 'y' };
            char[] r = { 'y', 'a', 'e', 'i', 'o', 'u' };
            var m = new Dictionary<char, char>();

            for (int i = 0; i < o.Length; i++)
            {
                m[r[i]] = o[i];
                m[char.ToUpper(r[i])] = char.ToUpper(o[i]);
            }

            for (int i = 0; i < n; i++)
            {
                string e = sr.ReadLine();
                char[] d = new char[e.Length];

                for (int j = 0; j < e.Length; j++)
                {
                    char cur = e[j];

                    if (m.ContainsKey(cur))
                        d[j] = m[cur];
                    else
                        d[j] = cur;
                }

                sw.WriteLine(new string(d));
            }

            sw.Flush();
            sw.Close();
            sr.Close();
        }
    }
}
