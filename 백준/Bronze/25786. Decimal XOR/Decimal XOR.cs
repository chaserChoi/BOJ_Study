using System;
using System.IO;
using System.Text;

class Program
{
    static void Main(string[] args)
    {
        using (var sr = new StreamReader(Console.OpenStandardInput()))
        using (var sw = new StreamWriter(Console.OpenStandardOutput()) { AutoFlush = true })
        {
            string num1 = sr.ReadLine();
            string num2 = sr.ReadLine();

            int max = Math.Max(num1.Length, num2.Length);
            num1 = num1.PadLeft(max, '0');
            num2 = num2.PadLeft(max, '0');

            char[] ans = new char[max];

            for (int i = 0; i < max; i++)
            {
                int digit1 = num1[i] - '0';
                int digit2 = num2[i] - '0';

                if (digit1 <= 2 && digit2 <= 2 || digit1 >= 7 && digit2 >= 7)
                    ans[i] = '0';
                else
                    ans[i] = '9';
            }

            sw.WriteLine(new string(ans));

            sw.Flush();
            sw.Close();
            sr.Close();
        }
    }
}
