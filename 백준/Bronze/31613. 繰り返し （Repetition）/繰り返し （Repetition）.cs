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
            int x = int.Parse(sr.ReadLine());
            int n = int.Parse(sr.ReadLine());
            int cnt = 0;

            while (x < n)
            {
                int r = x % 3;

                if (r == 0)
                    x += 1;
                else if (r == 1)
                    x *= 2;
                else if (r == 2)
                    x *= 3;

                cnt++;
            }

            sw.WriteLine(cnt);

            sw.Flush();
            sw.Close();
            sr.Close();
        }
    }
}
