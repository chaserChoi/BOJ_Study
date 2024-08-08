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
            string s = sr.ReadLine();

            while (true)
            {
                if (s.Length % 2 == 0 && 2 * CountChar(s, 's') == s.Length)
                    break;
                
                s = s.Substring(1);
            }

            sw.WriteLine(s);

            sw.Flush();
            sw.Close();
            sr.Close();
        }
    }

    static int CountChar(string s, char c)
    {
        int count = 0;

        foreach (char ch in s)
            if (ch == c) count++;

        return count;
    }
}
