using System;
using System.IO;

class Program
{
    static void Main(string[] args)
    {
        using (TextReader sr = new StreamReader(Console.OpenStandardInput()))
        using (TextWriter sw = new StreamWriter(Console.OpenStandardOutput()) { AutoFlush = false })
        {
            string[] input = sr.ReadLine().Split();
            int n = int.Parse(input[0]);
            int t = int.Parse(input[1]);

            input = sr.ReadLine().Split();
            int[] tasks = new int[n];
            for (int i = 0; i < n; i++)
                tasks[i] = int.Parse(input[i]);

            int complete = 0;
            int total = 0;

            for (int i = 0; i < n; i++)
            {
                if (total + tasks[i] <= t)
                {
                    total += tasks[i];
                    complete++;
                } else
                    break;
            }

            sw.WriteLine(complete);

            sw.Flush();
            sw.Close();
            sr.Close();
        }
    }
}
