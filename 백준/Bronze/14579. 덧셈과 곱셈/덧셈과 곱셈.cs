using System;
using System.IO;
using System.Text;

class Program
{
    static void Main(string[] args)
    {
        using (var sr = new StreamReader(Console.OpenStandardInput()))
        using (var sw = new StreamWriter(Console.OpenStandardOutput()))
        {
            string[] line = sr.ReadLine().Split();
            int a = int.Parse(line[0]);
            int b = int.Parse(line[1]);

            long result = 1;
            for (int i = a; i <= b; i++)
                result = (result * SumofFirstN(i)) % 14579;

            sw.WriteLine(result);

            sw.Flush();
            sw.Close();
            sr.Close();
        }
    }

    static long SumofFirstN(int n)
    {
        return (long)n * (n + 1) / 2;
    }
}
