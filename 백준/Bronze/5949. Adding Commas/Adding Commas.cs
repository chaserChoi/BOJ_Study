using System;
using System.IO;

class Program
{
    static void Main()
    {
        using (var sr = new StreamReader(Console.OpenStandardInput()))
        using (var sw = new StreamWriter(Console.OpenStandardOutput()))
        {
            string input = sr.ReadLine();
            
            long num = long.Parse(input);
            
            string result = num.ToString("N0");
            
            sw.WriteLine(result);
        }
    }
}
