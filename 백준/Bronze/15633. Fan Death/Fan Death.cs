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
            int n = int.Parse(sr.ReadLine());
            int sum = 0;
            for (int i = 1; i <= n; i++)
                if (n % i == 0)
                    sum += i;

            sw.WriteLine((sum * 5) - 24);

            sw.Flush();
            sw.Close();
            sr.Close();
        }
    }
}
