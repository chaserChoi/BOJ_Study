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
            string[] line = sr.ReadLine().Split();
            long a = long.Parse(line[0]);
            long b = long.Parse(line[1]);
            long c = long.Parse(line[2]);
            
            sw.WriteLine((double)a * b / c);

            sw.Flush();
            sw.Close();
            sr.Close();
        }
    }
}
