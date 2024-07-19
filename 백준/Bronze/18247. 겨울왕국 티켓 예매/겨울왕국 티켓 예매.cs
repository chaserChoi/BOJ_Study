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
            int t = int.Parse(sr.ReadLine());

            for (int i = 0; i < t; i++)
            {
                string[] line = sr.ReadLine().Split();
                int n = int.Parse(line[0]);
                int m = int.Parse(line[1]);

                if (n < 12) 
                {
                    sw.WriteLine(-1);
                    continue;
                }
                if (m < 4)
                {
                    sw.WriteLine(-1);
                    continue;
                }

                sw.WriteLine(11 * m + 4);
            }

            sw.Flush();
            sw.Close();
            sr.Close();
        }
    }
}
