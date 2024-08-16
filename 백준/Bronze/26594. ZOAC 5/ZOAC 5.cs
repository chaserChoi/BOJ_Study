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
            string line = sr.ReadLine();
            int max = 1;
            int cur = 1;

            for (int i = 1; i < line.Length; i++)
            {
                if (line[i] == line[i - 1])
                    cur++;
                else
                {
                    if (cur > max)
                        max = cur;
                    cur = 1;
                }
            }

            if (cur > max)
                max = cur;

            sw.WriteLine(max);

            sw.Flush();
            sw.Close();
            sr.Close();
        }
    }
}
