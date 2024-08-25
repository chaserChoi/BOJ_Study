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
            string str = sr.ReadLine();

            if (str[0] != str[str.Length - 1])
                sw.WriteLine("Win");
            else
                sw.WriteLine("Lose");

            sw.Flush();
            sw.Close();
            sr.Close();
        }
    }
}
