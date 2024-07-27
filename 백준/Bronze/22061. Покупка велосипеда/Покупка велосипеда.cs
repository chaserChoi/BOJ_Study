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
            int t = int.Parse(sr.ReadLine());

            for (int i = 0; i < t; i++)
            {
                string[] line = sr.ReadLine().Split();
                int a = int.Parse(line[0]);
                int b = int.Parse(line[1]);
                int c = int.Parse(line[2]);

                if (c % 2 == 1 && a == 0)
                    sw.WriteLine("NO");
                else
                {
                    if ((a + (b * 2)) >= c)
                        sw.WriteLine("YES");
                    else
                        sw.WriteLine("NO");
                }
            }

            sw.Flush();
            sw.Close();
            sr.Close();
        }
    }
}
