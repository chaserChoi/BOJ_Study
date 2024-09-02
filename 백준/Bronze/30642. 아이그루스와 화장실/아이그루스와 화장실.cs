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
            string mascot = sr.ReadLine();
            int k = int.Parse(sr.ReadLine());

            k += (mascot == "annyong" ? 1 : 0) ^ (k % 2);

            sw.WriteLine(k > n ? k - 2 : k);

            sw.Flush();
            sw.Close();
            sr.Close();
        }
    }
}
