using System;
using System.IO;
using System.Collections.Generic;

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
                List<int> grades = new List<int>();
                int num = int.Parse(sr.ReadLine());

                for (int j = 0; j < num; j++)
                {
                    int x = int.Parse(sr.ReadLine());
                    if (x < 6)
                        grades.Add(x + 1);
                }

                sw.WriteLine($"Case {i}:");

                foreach (int grad in grades)
                    sw.WriteLine(grad);
            }

            sw.Close();
            sr.Close();
        }
    }
}