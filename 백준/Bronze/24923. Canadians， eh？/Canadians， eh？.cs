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
            string line = sr.ReadLine();

            sw.WriteLine((line.Length >= 3 && line.Substring(line.Length - 3) == "eh?") ? "Canadian!" : "Imposter!");

            sw.Flush();
            sw.Close();
            sr.Close();
        }
    }
}
