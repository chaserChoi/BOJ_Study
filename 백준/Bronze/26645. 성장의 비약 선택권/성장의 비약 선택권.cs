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

            int type = 1;

            if (n >= 206)
                type++;
            if (n >= 218)
                type++;
            if (n >= 229)
                type++;

            sw.WriteLine(type);

            sw.Flush();
            sw.Close();
            sr.Close();
        }
    }
}
