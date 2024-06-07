using System;
using System.ComponentModel.DataAnnotations;
using System.IO;
using System.Xml;

class Program
{
    static void Main(string[] args)
    {
        using (var sr = new StreamReader(Console.OpenStandardInput()))
        using (var sw = new StreamWriter(Console.OpenStandardOutput()) { AutoFlush = true } )
        {
            int N = int.Parse(sr.ReadLine());

            string[] studentResponses = new string[N];
            string[] correctAns = new string[N];

            for (int i = 0; i < N; i++)
                studentResponses[i] = sr.ReadLine();
            for (int i = 0; i < N; i++)
                correctAns[i] = sr.ReadLine();

            int score = 0;
            for (int i = 0; i < N; i++) 
            {
                if (studentResponses[i] == correctAns[i])
                    score++;
            }

            sw.WriteLine(score);
            sw.Flush();
        }
    }
}
