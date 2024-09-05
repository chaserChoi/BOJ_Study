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
            int w = int.Parse(sr.ReadLine());

            sw.WriteLine(Math.Sqrt(w * 32));

            sw.Flush();
            sw.Close();
            sr.Close();
        }
    }
}
