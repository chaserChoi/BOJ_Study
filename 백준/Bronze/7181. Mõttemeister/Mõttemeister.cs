using System;
using System.IO;

class Program
{
    static void Main(string[] args)
    {
        using (StreamReader sr = new StreamReader(Console.OpenStandardInput()))
        using (StreamWriter sw = new StreamWriter(Console.OpenStandardOutput()) { AutoFlush = false })
        {
            string s = sr.ReadLine();
            int n = int.Parse(sr.ReadLine());

            for (int i = 0; i < n; i++)
            {
                string t = sr.ReadLine();

                int a = 0, b = 0;
                for (int j = 0; j < 4; j++)
                {
                    if (s.Contains(t[j])) a++;
                    if (t[j] == s[j]) b++;
                }

                sw.WriteLine($"{a} {b}");
            }
        }
    }
}