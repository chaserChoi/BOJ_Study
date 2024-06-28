using System;
using System.IO;

class Program
{
    static void Main(string[] args)
    {
        TextReader sr = new StreamReader(Console.OpenStandardInput());
        TextWriter sw = new StreamWriter(Console.OpenStandardOutput());

        int n = int.Parse(sr.ReadLine());
        int[] cards = Array.ConvertAll(sr.ReadLine().Split(), int.Parse);

        Array.Sort(cards);

        int max = 0;
        for (int i = 0; i < n - 1; i++)
            max += cards[i];

        sw.WriteLine(max);

        sw.Flush();
        sw.Close();
        sr.Close();
    }
}
