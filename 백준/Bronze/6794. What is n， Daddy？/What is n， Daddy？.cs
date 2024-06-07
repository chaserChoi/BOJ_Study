using System;
using System.ComponentModel.DataAnnotations;
using System.IO;
using System.Xml;

class Program
{
    static void Main(string[] args)
    {
        using (var sr = new StreamReader(Console.OpenStandardInput()))
        using (var sw = new StreamWriter(Console.OpenStandardOutput()) { AutoFlush = true } )
        {
            int n = int.Parse(sr.ReadLine());
            int cnt = 0;
            bool []check = new bool[6];

            for (int i = 0; i <=5; i++)
            {
                for (int j = 0; j <= 5; j++)
                {
                    if (i + j == n)
                        check[i] = true;
                }
            }
            for (int i = 0; i <= n/2; i++)
                if (check[i]) 
                    cnt++;

            sw.WriteLine(cnt);
            sw.Flush();
        }
    }
}
