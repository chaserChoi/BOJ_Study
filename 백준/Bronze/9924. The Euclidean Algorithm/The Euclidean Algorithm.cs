using System;
using System.IO;
using System.Text;

class Program
{
    static void Main(string[] args)
    {
        using (TextReader sr = new StreamReader(Console.OpenStandardInput()))
        using (TextWriter sw = new StreamWriter(Console.OpenStandardOutput()) { AutoFlush = false })
        {
            var input = sr.ReadLine().Split();
            var a = int.Parse(input[0]);
            var b = int.Parse(input[1]);
            int ans = 0;

            while (a != b)
            {
                int c = Math.Max(a, b) - Math.Min(a, b);
                int d = Math.Min(a, b);
                a = c;
                b = d;
                ans++;
            }

            sw.WriteLine(ans);

            sw.Close();
            sr.Close();
        }
    }
}
