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
            string[] line = sr.ReadLine().Split();
            int[] problems = Array.ConvertAll(line, int.Parse);

            int max = 0;
            int curr = 0;

            for (int i = 0; i < n; i++)
            {
                if (problems[i] > 0)
                    curr++;
                else 
                {
                    if (curr > max)
                        max = curr;
                    curr = 0;
                }
            }

            if (curr > max)
                max = curr;

            sw.WriteLine(max);

            sw.Flush();
            sw.Close();
            sr.Close();
        }
    }
}
