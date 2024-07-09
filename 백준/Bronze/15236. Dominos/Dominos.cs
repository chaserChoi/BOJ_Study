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
            int N = int.Parse(sr.ReadLine());

            sw.WriteLine((N * (N + 1) * (N + 2)) / 2);

            sw.Flush();
            sw.Close();
            sr.Close();
        }
    }
}
