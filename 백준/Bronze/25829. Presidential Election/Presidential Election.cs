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

            int a = 0;
            int b = 0;

            while (n-- > 0)
            {
                string[] line = sr.ReadLine().Split();
                int e = int.Parse(line[0]);
                int v1 = int.Parse(line[1]);
                int v2 = int.Parse(line[2]);

                a += v1 - v2;
                b += e * (v1 > v2 ? 1 : -1);
            }

            sw.WriteLine(a > 0 && b > 0 ? 1 : a < 0 && b < 0 ? 2 : 0);

            sw.Flush();
            sw.Close();
            sr.Close();
        }
    }
}
