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
            var line = sr.ReadLine();
            int n = int.Parse(line);

            List<int> lectures = new List<int>(n);

            line = sr.ReadLine();
            string[] parts = line.Split(' ');
            for (int i = 0; i < n; i++)
                lectures.Add(int.Parse(parts[i]));

            int empty = 0;
            int missed = 0;
            int prev = lectures[0];

            for (int i = 0; i < n; i++)
            {
                int cur = lectures[i];
                if (cur < prev)
                    empty += prev - cur;
                else if (cur > prev)
                    missed += cur - prev;

                prev = cur;
            }

            sw.WriteLine($"{empty} {missed}");

            sw.Flush();
            sw.Close();
            sr.Close();
        }
    }
}
