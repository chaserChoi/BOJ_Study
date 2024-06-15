using System;
using System.IO;
using System.Text;

class Program
{
    static void Main(string[] args)
    {
        using (TextReader sr = new StreamReader(Console.OpenStandardInput()))
        using (TextWriter sw = new StreamWriter(Console.OpenStandardOutput()) { AutoFlush = false })
        {
            string target = sr.ReadLine();
            int tlen = target.Length;
            int ans = 0;

            string cur;
            while ((cur = sr.ReadLine()) != null)
            {
                int clen = cur.Length;
                for (int i = tlen; i <= clen; i++)
                {
                    if (cur.Substring(i - tlen, tlen) == target)
                        ans++;
                }
            }

            sw.WriteLine(ans);

            sw.Close();
            sr.Close();
        }
    }
}
