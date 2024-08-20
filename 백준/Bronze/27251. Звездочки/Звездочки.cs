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

            for (int i = 1; i <= n; i++)
            {
                int s = i * i;

                if (s > 100)
                    sw.WriteLine(new string('*', 100) + "...");
                else
                    sw.WriteLine(new string('*', s));
            }

            sw.Flush();
            sw.Close();
            sr.Close();
        }
    }
}
