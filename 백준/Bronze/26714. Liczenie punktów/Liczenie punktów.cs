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
            string str = sr.ReadLine();

            int s = n / 10;
            int p = 0;

            for (int i = 0; i < 10; i++)
            {
                string ans = str.Substring(i * s, s);
                if (ans.All(c => c == 'T'))
                    p++;
            }

            sw.WriteLine(p);

            sw.Flush();
            sw.Close();
            sr.Close();
        }
    }
}
