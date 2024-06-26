using System;
using System.IO;
using System.Text;

class Program
{
    static void Main(string[] args) 
    {
        using (TextReader sr = new StreamReader(Console.OpenStandardInput()))
        using (TextWriter sw = new StreamWriter(Console.OpenStandardOutput()) { AutoFlush = false })
        {
            int num = int.Parse(sr.ReadLine());
            int step = 0;

            while (num >= 10)
            {
                int prod = 1;
                while (num > 0)
                {
                    prod *= num % 10;
                    num /= 10;
                }
                num = prod;
                step++;
            }

            sw.WriteLine(step);

            sw.Flush();
            sr.Close();
            sw.Close();
        }
    }
}
