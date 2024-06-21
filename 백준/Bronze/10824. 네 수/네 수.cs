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
            string[] input = sr.ReadLine().Split();
            long a = long.Parse(input[0]);
            long b = long.Parse(input[1]);
            long c = long.Parse(input[2]);
            long d = long.Parse(input[3]);

            long ab = long.Parse(a.ToString() + b.ToString());
            long cd = long.Parse(c.ToString() + d.ToString());

            sw.WriteLine(ab + cd);

            sw.Flush();
            sw.Close();
            sr.Close();
        }
    }
}
