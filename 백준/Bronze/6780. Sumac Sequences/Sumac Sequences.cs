using System;
using System.ComponentModel.DataAnnotations;
using System.IO;

class Program
{
    static void Main(string[] args)
    {
        using (var sr = new StreamReader(Console.OpenStandardInput()))
        using (var sw = new StreamWriter(Console.OpenStandardOutput()) { AutoFlush = true } )
        {
            int t1 = int.Parse(sr.ReadLine());
            int t2 = int.Parse(sr.ReadLine());

            int len = 2;

            while (t1 >= t2)
            {
                int temp = t1 - t2;
                t1 = t2;
                t2 = temp;

                len++;
            }

            sw.WriteLine(len);
            sw.Flush();
        }
    }
}
