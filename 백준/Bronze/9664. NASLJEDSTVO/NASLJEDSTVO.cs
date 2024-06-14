using System;
using System.IO;
using System.Text;

class Program
{
    static void Main(string[] args)
    {
        using (StreamReader sr = new StreamReader(Console.OpenStandardInput()))
        using (StreamWriter sw = new StreamWriter(Console.OpenStandardOutput()) { AutoFlush = false })
        {
            StringBuilder sb = new StringBuilder();

            int daughter = int.Parse(sr.ReadLine());
            int remain = int.Parse(sr.ReadLine());

            int di = remain / (daughter - 1);
            int minTotal = remain + di;

            if (remain - di * (daughter - 1) == 0)
                sw.WriteLine($"{minTotal - 1} {minTotal}");
            else
                sw.WriteLine($"{minTotal} {minTotal}");

            sw.Close();
            sr.Close();
        }
    }
}
