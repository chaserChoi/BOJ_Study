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
            for (int i = 10; i < 100; i++)
            {
                for (int j = 1; j < 10; j++)
                {
                    for (int k = 10; k < 100; k++)
                    {
                        int x = i * 10 + j;
                        int y = j * 100 + k;

                        if (x / (double)y == i / (double)k && (x != y || i != k))
                            sw.WriteLine($"{x} / {y} = {i} / {k}");
                    }
                }
            }

            sw.Close();
            sr.Close();
        }
    }
}