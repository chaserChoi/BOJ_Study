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
            int x = int.Parse(sr.ReadLine());
            int n = int.Parse(sr.ReadLine());
            int MB = x;

            for (int i = 0; i < n; i++)
            {
                int spent = int.Parse(sr.ReadLine());
                MB += x - spent;
            }

            sw.WriteLine(MB);

            sw.Flush();
            sw.Close();
            sr.Close();
        }
    }
}
