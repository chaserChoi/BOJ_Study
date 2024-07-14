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
            int t = int.Parse(sr.ReadLine());

            sw.WriteLine((int)((double)t * t / 4.0 + 0.5));

            sw.Flush();
            sw.Close();
            sr.Close();
        }
    }
}
