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
            int h = 0;
            int cur = 1;
            
            while (cur * cur <= n)
            {
                n -= cur * cur;
                cur += 2;
                h++;
            }

            sw.WriteLine(h);

            sw.Flush();
            sw.Close();
            sr.Close();
        }
    }
}
