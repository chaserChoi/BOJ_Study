using System;
using System.IO;

class Program
{
    static void Main()
    {
        using (var sr = new StreamReader(Console.OpenStandardInput()))
        using (var sw = new StreamWriter(Console.OpenStandardOutput()))
        {
            int T = int.Parse(sr.ReadLine());

            for (int i = 0; i < T; i++)
            {
                string S = sr.ReadLine();
                if (S[S.Length / 2] == S[S.Length / 2 - 1]) sw.WriteLine("Do-it");
                else sw.WriteLine("Do-it-Not");
            }
        }
    }
}
