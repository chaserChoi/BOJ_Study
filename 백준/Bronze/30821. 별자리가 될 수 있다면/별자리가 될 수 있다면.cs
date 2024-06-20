using System;
using System.IO;

class Program
{
    static void Main(string[] args)
    {
        using (TextReader sr = new StreamReader(Console.OpenStandardInput()))
        using (TextWriter sw = new StreamWriter(Console.OpenStandardOutput()) { AutoFlush = false })
        {
            double n = double.Parse(sr.ReadLine());

            sw.WriteLine(n*(n-1)*(n-2)*(n-3)*(n-4)/120);

            sw.Flush();
            sw.Close();
            sr.Close();
        }
    }
}
