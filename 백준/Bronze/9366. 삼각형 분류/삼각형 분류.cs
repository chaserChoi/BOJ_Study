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
                string[] input = sr.ReadLine().Split();
                int a = int.Parse(input[0]);
                int b = int.Parse(input[1]);
                int c = int.Parse(input[2]);

                sw.Write($"Case #{i + 1}: ");

                if (a + b <= c || b + c <= a || a + c <= b)
                    sw.WriteLine("invalid!");
                else if (a == b && b == c)
                    sw.WriteLine("equilateral");
                else if (a == b || b == c || a == c)
                    sw.WriteLine("isosceles");
                else
                    sw.WriteLine("scalene");
            }

            sw.Close();
            sr.Close();
        }
    }
}
