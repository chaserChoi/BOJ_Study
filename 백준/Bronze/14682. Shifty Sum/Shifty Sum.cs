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
            int N = int.Parse(sr.ReadLine());
            int k = int.Parse(sr.ReadLine());

            long sum = N;
            long num = N;

            for (int i = 0; i < k; i++)
            {
                num *= 10;
                sum += num;
            }

            sw.WriteLine(sum);

            sw.Flush();
            sw.Close();
            sr.Close();
        }
    }
}
