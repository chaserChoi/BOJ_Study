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

            for (int i = 1; i <= T; i++)
            {
                string[] input = sr.ReadLine().Split();
                int n = int.Parse(input[0]);
                int d = int.Parse(input[1]);

                int q = n / d;
                int r = n % d;

                sw.Write($"Case {i}: ");

                if (q != 0 && r != 0)
                    sw.WriteLine($"{q} {r}/{d}");
                else if (q != 0)
                    sw.WriteLine(q);
                else if (r != 0)
                    sw.WriteLine($"{r}/{d}");
                else 
                    sw.WriteLine(0);
            }

            sw.Close();
            sr.Close();
        }
    }
}
