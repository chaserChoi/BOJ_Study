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
            int m = int.Parse(sr.ReadLine());

            int correctM;

            if (m < 30)
                correctM = m / 2;
            else
                correctM = 15 + (m - 30) * 3 / 2;

            sw.WriteLine($"{correctM}.{(m & 1) * 5}");

            sw.Flush();
            sw.Close();
            sr.Close();
        }
    }
}
