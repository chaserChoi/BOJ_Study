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

            int K = -1;
            for (int i = 1; i * i <= n; i++)
            {
                if (1 + i + i * i == n)
                {
                    K = i;
                    break;
                }
            }

            sw.WriteLine(K);

            sw.Flush();
            sw.Close();
            sr.Close();
        }
    }
}
