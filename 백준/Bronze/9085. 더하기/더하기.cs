using System;
using System.IO;

class Program
{
    static void Main(string[] args)
    {
        using (StreamReader sr = new StreamReader(Console.OpenStandardInput()))
        using (StreamWriter sw = new StreamWriter(Console.OpenStandardOutput()) { AutoFlush = false })
        {
            int T = int.Parse(sr.ReadLine());

            for (int i = 0; i < T; i++)
            {
                int N = int.Parse(sr.ReadLine());
                string[] inputs = sr.ReadLine().Split(' ');
                int sum = 0;

                for (int j = 0; j < N; j++)
                    sum += int.Parse(inputs[j]);

                sw.WriteLine(sum);
            }

            sw.Close();
            sr.Close();
        }
    }
}