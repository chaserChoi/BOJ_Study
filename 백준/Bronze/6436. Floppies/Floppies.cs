using System;
using System.Formats.Asn1;
using System.IO;

class Program
{
    static void Main(string[] args)
    {
        using (var sr = new StreamReader(Console.OpenStandardInput()))
        using (var sw = new StreamWriter(Console.OpenStandardOutput()) { AutoFlush = true } )
        {
            int T = 1;
            while (true) {
                int s = int.Parse(sr.ReadLine());
                if (s == 0) break;

                double compressedSize = s / 2.0;
                compressedSize = Math.Round(compressedSize * 1.5);
                double lines = compressedSize / 62;
                double files = Math.Ceiling(lines / 30000);
                double floppies = files;

                sw.WriteLine($"File #{T}");
                sw.WriteLine($"John needs {floppies} floppies. \n");
                T++;
            }
        }
    }
}
