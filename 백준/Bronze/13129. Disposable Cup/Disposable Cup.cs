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
            string[] input = sr.ReadLine().Split();
            int A = int.Parse(input[0]);
            int B = int.Parse(input[1]);
            int N = int.Parse(input[2]);

            for (int i = 1; i <= N; i++)
                sw.Write((A * N + B * i) + " ");

            sw.Flush();
            sw.Close();
            sr.Close();
        }
    }
}
