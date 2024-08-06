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
            var first = sr.ReadLine().Split();
            int d = int.Parse(first[0]);
            int m = int.Parse(first[1]);
            int w = int.Parse(first[2]);

            var sec = sr.ReadLine().Split();
            int i = int.Parse(sec[0]);
            int j = int.Parse(sec[1]);
            long k = int.Parse(sec[2]);

            long total = (k - 1) * m * d + (j - 1) * d + (i - 1);

            char ans = (char)('a' + (total % w));

            sw.WriteLine(ans);

            sw.Flush();
            sw.Close();
            sr.Close();
        }
    }
}
