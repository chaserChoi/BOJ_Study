using System;
using System.IO;

class Program
{
    static void Main()
    {
        using (StreamReader sr = new StreamReader(Console.OpenStandardInput()))
        using (StreamWriter sw = new StreamWriter(Console.OpenStandardOutput()))
        {
            while (true)
            {
                string[] inputs = sr.ReadLine().Split(' ');
                int A = int.Parse(inputs[0]);
                int B = int.Parse(inputs[1]);

                if (A == 0 && B == 0) break;

                int C = 2 * A - B;

                sw.WriteLine(C);
            }

            sw.Flush();
        }
    }
}
