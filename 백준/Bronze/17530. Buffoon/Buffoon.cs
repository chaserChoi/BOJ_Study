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
            int N = int.Parse(sr.ReadLine());
            int[] votes = new int[N];

            for (int i = 0; i < N; i++)
                votes[i] = int.Parse(sr.ReadLine());

            int max = votes[0];
            int idx = 0;
            for (int i = 1; i < N; i++)
            {
                if (votes[i] > max)
                {
                    max = votes[i];
                    idx = i;
                }
            }

            sw.WriteLine(idx == 0 ? "S" : "N");

            sw.Flush();
            sw.Close();
            sr.Close();
        }
    }
}
