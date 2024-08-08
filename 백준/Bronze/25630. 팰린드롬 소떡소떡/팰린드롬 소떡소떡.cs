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

            int changes = 0;

            for (int i = 0; i < n / 2; i++)
            {
                if (s[i] != s[n - i - 1])
                    changes++;
            }

            sw.WriteLine(changes);

            sw.Flush();
            sw.Close();
            sr.Close();
        }
    }
}
