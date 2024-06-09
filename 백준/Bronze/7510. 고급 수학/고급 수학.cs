using System;
using System.IO;

class Program
{
    static void Main(string[] args)
    {
        using (StreamReader sr = new StreamReader(Console.OpenStandardInput()))
        using (StreamWriter sw = new StreamWriter(Console.OpenStandardOutput()) { AutoFlush = false })
        {
            int n = int.Parse(sr.ReadLine());

            for (int i = 1; i <= n; i++)
            {
                string[] inputs = sr.ReadLine().Split(' ');
                int a = int.Parse(inputs[0]);
                int b = int.Parse(inputs[1]);
                int c = int.Parse(inputs[2]);

                sw.WriteLine($"Scenario #{i}:");

                if (a * a + b * b == c * c || b * b + c * c == a * a || c * c + a * a == b * b)
                    sw.WriteLine("yes");
                else
                    sw.WriteLine("no");

                if (i != n) 
                    sw.WriteLine();
            }

            sr.Close();
            sw.Close();
        }
    }
}