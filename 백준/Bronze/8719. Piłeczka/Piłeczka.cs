using System;
using System.IO;

class Program
{
    static void Main(string[] args)
    {
        using (StreamReader sr = new StreamReader(Console.OpenStandardInput()))
        using (StreamWriter sw = new StreamWriter(Console.OpenStandardOutput()) { AutoFlush = false })
        {
            int t = int.Parse(sr.ReadLine());

            for (int i = 0; i < t; i++)
            {
                string[] inputs = sr.ReadLine().Split();
                long x = long.Parse(inputs[0]);
                long w = long.Parse(inputs[1]);

                int bounces = 0;

                while (x < w)
                {
                    x *= 2;
                    bounces++;
                }

                sw.WriteLine(bounces);
            }

            sr.Close();
            sw.Close();
        }
    }
}