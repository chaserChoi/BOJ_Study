using System;
using System.IO;
using System.Text;

class Program
{
    static void Main(string[] args)
    {
        using (var sr = new StreamReader(Console.OpenStandardInput()))
        using (var sw = new StreamWriter(Console.OpenStandardOutput()) { AutoFlush = true })
        {
            int n = int.Parse(sr.ReadLine());
            int[] cases = new int[n];

            for (int i = 0; i < n; i++)
                cases[i] = int.Parse(sr.ReadLine());

            int total = 0;

            for (int i = 1; i < n; i++)
            {
                if (cases[i] > cases[i - 1])
                {
                    total += cases[i] - cases[i - 1];
                    cases[i] = cases[i - 1];
                }
            }

            sw.WriteLine(total);

            sw.Flush();
            sw.Close();
            sr.Close();
        }
    }
}
