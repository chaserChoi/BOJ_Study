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
            string[] line = sr.ReadLine().Split();
            int n = int.Parse(line[0]);
            long k = long.Parse(line[1]);
            n--;

            while (n-- > 0)
                k >>= 1;

            sw.WriteLine(k);

            sw.Flush();
            sw.Close();
            sr.Close();
        }
    }
}
