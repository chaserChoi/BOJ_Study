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
            string playerExclude = string.Empty;
            long max = -1;

            for (int i = 0; i < n; i++)
            {
                var line = sr.ReadLine().Split();
                long salary = long.Parse(line[0]);
                string surname = line[1];
                string citizenship = line[2];

                if (citizenship == "Russia" && salary > max)
                {
                    max = salary;
                    playerExclude = surname;
                }
            }

            sw.WriteLine(playerExclude);

            sw.Flush();
            sw.Close();
            sr.Close();
        }
    }
}
