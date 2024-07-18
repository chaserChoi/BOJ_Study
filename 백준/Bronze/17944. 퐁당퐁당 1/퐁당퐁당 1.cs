using System;
using System.IO;
using System.Text;

class Program
{
    static void Main(string[] args)
    {
        using (var sr = new StreamReader(Console.OpenStandardInput()))
        using (var sw = new StreamWriter(Console.OpenStandardOutput()))
        {
            string[] line = sr.ReadLine().Split();
            int n = int.Parse(line[0]);
            int t = int.Parse(line[1]);

            int ans = 1;
            int del = 1;

            while (--t > 0)
            {
                ans += del;
                del = (ans == 1 || ans == 2 * n) ? -del : del;
            }

            sw.WriteLine(ans);

            sw.Flush();
            sw.Close();
            sr.Close();
        }
    }
}
