using System;
using System.IO;

class Program
{
    static void Main(string[] args)
    {
        using (var sr = new StreamReader(Console.OpenStandardInput()))
        using (var sw = new StreamWriter(Console.OpenStandardOutput()) { AutoFlush = true } )
        {
            string input = sr.ReadLine();
            string valid = "IOSHZXN";
            bool isRotated = true;

            foreach (char c in input)
            {
                if (!valid.Contains(c))
                {
                    isRotated = false;
                    break;
                }
            }

            sw.WriteLine(isRotated ? "YES" : "NO");
            sw.Flush();
        }
    }
}
