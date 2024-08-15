using System;
using System.IO;
using System.Text;

class Program
{
    static void Main(string[] args)
    {
        using (var sr = new StreamReader(Console.OpenStandardInput()))
        using (var sw = new StreamWriter(Console.OpenStandardOutput()) { AutoFlush = true })
        {
            int n = int.Parse(sr.ReadLine());
            
            for (int i = 0; i < n; i++)
            {
                long l = long.Parse(sr.ReadLine());

                sw.WriteLine(l * (l + 1) * (l + 2) / 6);
            }

            sw.Flush();
            sw.Close();
            sr.Close();
        }
    }
}
