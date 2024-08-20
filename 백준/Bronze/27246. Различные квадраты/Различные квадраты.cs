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
            long n = long.Parse(sr.ReadLine());
            
            long cnt = 0;
            long k = 1;

            while (n >= k * k)
            {
                n -= k * k;
                cnt++;
                k++;
            }

            sw.WriteLine(cnt);

            sw.Flush();
            sw.Close();
            sr.Close();
        }
    }
}
