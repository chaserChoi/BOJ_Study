using System;
using System.IO;

class Program
{
    static void Main(string[] args)
    {
        using (StreamReader sr = new StreamReader(Console.OpenStandardInput()))
        using (StreamWriter sw = new StreamWriter(Console.OpenStandardOutput()) { AutoFlush = false })
        {
            string[] firstLine = sr.ReadLine().Split(' ');
            int n = int.Parse(firstLine[0]);
            int k = int.Parse(firstLine[1]);

            int ans = 0, cur = 0;
            while (n-- > 0)
            {
                string[] line = sr.ReadLine().Split(' ');
                int a = int.Parse(line[0]);
                int b = int.Parse(line[1]);

                cur += a - b;
                ans = Math.Max(ans, cur - k);
            }

            sw.WriteLine(ans);

            sr.Close();
            sw.Close();
        }
    }
}