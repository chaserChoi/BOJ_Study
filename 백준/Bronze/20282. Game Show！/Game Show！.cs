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
            int c = int.Parse(sr.ReadLine());

            int max = 100;
            int cur = 100;
            int[] vals = new int[c];

            for (int i = 0; i < c; i++)
                vals[i] = int.Parse(sr.ReadLine());

            for (int i = 0; i < c; i++)
            {
                cur += vals[i];
                if (cur > max)
                    max = cur;
            }

            sw.WriteLine(max);

            sw.Flush();
            sw.Close();
            sr.Close();
        }
    }
}
