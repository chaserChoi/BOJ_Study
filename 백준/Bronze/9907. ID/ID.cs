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
            string input = sr.ReadLine();
            int[] weights = { 2, 7, 6, 5, 4, 3, 2 };
            int sum = 0;

            for (int i = 0; i < 7; i++)
                sum += (input[i] - '0') * weights[i];

            int remainder = sum % 11;
            char letter = "JABCDEFGHIZ"[remainder];

            sw.WriteLine(letter);

            sw.Close();
            sr.Close();
        }
    }
}
