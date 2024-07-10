using System;
using System.IO;
using System.Text;

class Program
{
    static void Main(string[] args)
    {
        using (var sr = new StreamReader(Console.OpenStandardInput()))
        using (var sw = new StreamWriter(Console.OpenStandardOutput()))
        {
            int P = int.Parse(sr.ReadLine());

            while(P-- > 0) 
            {
                string[] line = sr.ReadLine().Split();
                int K = int.Parse(line[0]);
                int N = int.Parse(line[1]);

                int candles = (N * (N + 1)) / 2 + N;
                sw.WriteLine($"{K} {candles}");
            }

            sw.Flush();
            sw.Close();
            sr.Close();
        }
    }
}
