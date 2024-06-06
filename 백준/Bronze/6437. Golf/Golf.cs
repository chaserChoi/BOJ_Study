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
            while (true)
            {
                string[] tokens = sr.ReadLine().Split(' ');
                int p = int.Parse(tokens[0]);
                int s = int.Parse(tokens[1]);
                if (p == 0) break;

                sw.WriteLine($"Hole #{T++}");

                if (s == 1)
                    sw.WriteLine("Hole-in-one.");
                else 
                {
                    int diff = s - p;
                    switch (diff)
                    {
                        case -3:
                            sw.WriteLine("Double eagle.");
                            break;
                        case -2:
                            sw.WriteLine("Eagle.");
                            break;
                        case -1:
                            sw.WriteLine("Birdie.");
                            break;
                        case 0:
                            sw.WriteLine("Par.");
                            break;
                        case 1:
                            sw.WriteLine("Bogey.");
                            break;
                        case 2:
                            sw.WriteLine("Double Bogey.");
                            break;
                        default:
                            if (diff > 2) sw.WriteLine("Double Bogey.");
                            else sw.WriteLine("Error.");
                            break;
                    }
                }
                sw.WriteLine();
            }
            sw.Flush();
        }
    }
}
