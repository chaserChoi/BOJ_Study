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
            string word = sr.ReadLine();

            if (word.Contains("ss"))
                sw.WriteLine("hiss");
            else
                sw.WriteLine("no hiss");

            sw.Flush();
            sw.Close();
            sr.Close();
        }
    }
}
