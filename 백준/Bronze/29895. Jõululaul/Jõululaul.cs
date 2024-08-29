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
            var n = long.Parse(sr.ReadLine());

            StringBuilder sb = new StringBuilder();

            Enumerable.Range(1, (int)n)
                .Select(i => (long)i * (n - i + 1))
                .ToList()
                .ForEach(ans => sb.AppendLine(ans.ToString()));
            
            sw.Write(sb.ToString());

            sw.Flush();
            sw.Close();
            sr.Close();
        }
    }
}
