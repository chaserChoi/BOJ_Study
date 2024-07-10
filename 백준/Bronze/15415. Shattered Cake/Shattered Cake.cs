using System;
using System.IO;
using System.Text;

class Program
{
    static void Main(string[] args)
    {
        using (var sr = new StreamReader(Console.OpenStandardInput()))
        using (var sw = new StreamWriter(Console.OpenStandardOutput()))
        {
            int W = int.Parse(sr.ReadLine());
            int N = int.Parse(sr.ReadLine());
            long sum = 0;

            while (N-- > 0)
            {
                string[] line = sr.ReadLine().Split();
                long a = long.Parse(line[0]);
                long b = long.Parse(line[1]);

                sum += a * b;
            }

            sw.WriteLine(sum / W);

            sw.Flush();
            sw.Close();
            sr.Close();
        }
    }
}
