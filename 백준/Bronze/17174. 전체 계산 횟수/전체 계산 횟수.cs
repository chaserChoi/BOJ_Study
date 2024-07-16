using System;
using System.IO;

class Program
{
    static void Main(string[] args)
    {
        using (var sr = new StreamReader(Console.OpenStandardInput()))
        using (var sw = new StreamWriter(Console.OpenStandardOutput()) { AutoFlush = true } )
        {
            string[] line = sr.ReadLine().Split();
            int N = int.Parse(line[0]);
            int M = int.Parse(line[1]);

            int cnt = N;
            while (N != 0)
                cnt += (N /= M);

            sw.WriteLine(cnt);

            sw.Flush();
            sw.Close();
            sr.Close();
        }
    }
}
