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
            string[] line = sr.ReadLine().Split();
            int N = int.Parse(line[0]);
            int T = int.Parse(line[1]);
            int C = int.Parse(line[2]);
            int P = int.Parse(line[3]);

            sw.WriteLine((N - 1) / T * C * P);

            sw.Flush();
            sw.Close();
            sr.Close();
        }
    }
}
