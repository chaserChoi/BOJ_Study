using System;
using System.IO;
using System.Text;
using System.Collections.Generic;

class Program
{
    static void Main(string[] args)
    {
        using (var sr = new StreamReader(Console.OpenStandardInput()))
        using (var sw = new StreamWriter(Console.OpenStandardOutput()))
        {
            int N = int.Parse(sr.ReadLine());
            List<(int score, int submit, int time, int idx)> lists = new List<(int, int, int, int)>();

            for (int i = 0; i < N; i++) 
            {
                string[] line = sr.ReadLine().Split();
                int score = int.Parse(line[0]);
                int submit = int.Parse(line[1]);
                int time = int.Parse(line[2]);
                lists.Add((score, submit, time, i+1));
            }

            lists.Sort((a, b) =>
            {
                if (a.score != b.score) return b.score.CompareTo(a.score);
                if (a.submit != b.submit) return a.submit.CompareTo(b.submit);
                return a.time.CompareTo(b.time);
            });

            sw.WriteLine(lists[0].idx);

            sw.Flush();
            sw.Close();
            sr.Close();
        }
    }
}
