using System;
using System.IO;

class Program
{
    static void Main(string[] args)
    {
        using (TextReader sr = new StreamReader(Console.OpenStandardInput()))
        using (TextWriter sw = new StreamWriter(Console.OpenStandardOutput()) { AutoFlush = false })
        {
            int T = int.Parse(sr.ReadLine());

            for (int i = 0; i < T; i++)
            {
                double original = double.Parse(sr.ReadLine());
                double discount = original * 0.8;
                sw.WriteLine($"${discount:F2}");
            }

            sw.Flush();
            sw.Close();
            sr.Close();
        }
    }
}
