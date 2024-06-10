using System;
using System.IO;

class Program
{
    static void Main(string[] args)
    {
        using (StreamReader sr = new StreamReader(Console.OpenStandardInput()))
        using (StreamWriter sw = new StreamWriter(Console.OpenStandardOutput()) { AutoFlush = false })
        {
            int z = int.Parse(sr.ReadLine());

            for (int i = 0; i < z; i++)
            {
                string[] inputs = sr.ReadLine().Split();
                long a = long.Parse(inputs[0]);
                long b = long.Parse(inputs[1]);

                if (b % a == 0)
                    sw.WriteLine("TAK");
                else
                    sw.WriteLine("NIE");
            }

            sr.Close();
            sw.Close();
        }
    }
}