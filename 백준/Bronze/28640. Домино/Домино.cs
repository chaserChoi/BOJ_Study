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
            string domino1 = sr.ReadLine();
            string domino2 = sr.ReadLine();

            int[] score1 = GetScore(domino1);
            int[] score2 = GetScore(domino2);

            if (score1[0] == score2[0] || score1[0] == score2[1] || score1[1] == score2[0] || score1[1] == score2[1])
                sw.WriteLine("Yes");
            else
                sw.WriteLine("No");

            sw.Flush();
            sw.Close();
            sr.Close();
        }
    }

    static int[] GetScore(string domino)
    {
        string[] score = domino.Split('|');
        int l = score[0].Length;
        int r = score[1].Length;

        return new int[] { l, r };
    }
}
