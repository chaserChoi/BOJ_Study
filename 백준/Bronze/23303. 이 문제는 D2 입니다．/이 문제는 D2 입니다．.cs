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
            string line = sr.ReadLine();

            if (line.Contains("D2") || line.Contains("d2"))
                sw.WriteLine("D2");
            else
                sw.WriteLine("unrated");       

            sw.Flush();
            sw.Close();
            sr.Close();
        }
    }
}
