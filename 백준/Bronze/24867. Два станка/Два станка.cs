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
            long k = long.Parse(sr.ReadLine());
            var first = sr.ReadLine().Split();
            long a = long.Parse(first[0]);
            long x = long.Parse(first[1]);

            var second = sr.ReadLine().Split();
            long b = long.Parse(second[0]); 
            long y = long.Parse(second[1]); 

            long c = Math.Max(0, k - a) * x + Math.Max(0, k - a - b) * y;

            long d = Math.Max(0, k - b) * y + Math.Max(0, k - a - b) * x;

            long max = Math.Max(0, Math.Max(c, d));

            Console.WriteLine(max);

            sw.Flush();
            sw.Close();
            sr.Close();
        }
    }
}
