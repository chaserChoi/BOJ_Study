using System;
using System.IO;
using Microsoft.Win32.SafeHandles;

class Program
{
    static void Main(string[] args)
    {
        using (StreamReader sr = new StreamReader(Console.OpenStandardInput()))
        using (StreamWriter sw = new StreamWriter(Console.OpenStandardOutput()))
        {
            int n = int.Parse(sr.ReadLine());
            int m = int.Parse(sr.ReadLine());

            string[] adj = new string[n];
            string[] nouns = new string[m];

            for (int i = 0; i < n; i++)
                adj[i] = sr.ReadLine();

            for (int i = 0; i < m; i++)
                nouns[i] = sr.ReadLine();

            foreach (string adjective in adj)
                foreach (string noun in nouns)
                    sw.WriteLine($"{adjective} as {noun}");

            sw.Flush();
        }
    }
}