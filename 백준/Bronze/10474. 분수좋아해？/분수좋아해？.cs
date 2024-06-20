using System;
using System.IO;

class Program
{
    static void Main(string[] args)
    {
        using (TextReader sr = new StreamReader(Console.OpenStandardInput()))
        using (TextWriter sw = new StreamWriter(Console.OpenStandardOutput()) { AutoFlush = false })
        {
            string input;
            while ((input = Console.ReadLine()) != "0 0")
            {
                string[] parts = input.Split();
                int num = int.Parse(parts[0]);
                int denom = int.Parse(parts[1]);

                int whole = num / denom;
                int reminder = num % denom;
                sw.WriteLine($"{whole} {reminder} / {denom}");
            }

            sw.Flush();
            sw.Close();
            sr.Close();
        }
    }
}
