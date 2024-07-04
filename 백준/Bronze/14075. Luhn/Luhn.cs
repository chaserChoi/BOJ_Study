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
            string num = sr.ReadLine();

            int sum = 0;
            for (int i = 0; i < 16; i++)
            {
                int digit = num[15 - i] - '0';
                if (i % 2 == 1)
                {
                    digit *= 2;
                    if (digit >= 10)
                        digit = digit / 10 + digit % 10;
                }
                sum += digit;
            }

            sw.WriteLine(sum % 10 == 0 ? "DA" : "NE");

            sw.Flush();
            sw.Close();
            sr.Close();
        }
    }
}
