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
            int total = 0;

            for (int i = 0; i < n; i++)
            {
                string[] line = sr.ReadLine().Split();
                int h = int.Parse(line[0]);
                int b = int.Parse(line[1]);
                int k = int.Parse(line[2]);

                if (h < b)
                {
                    int need = b - h;
                    total += need * k;
                }
            }

            sw.WriteLine(total);

            sw.Flush();
            sw.Close();
            sr.Close();
        }
    }
}
