using System;
using System.IO;

class Program
{
    static void Main()
    {
        using (var sr = new StreamReader(Console.OpenStandardInput()))
        using (var sw = new StreamWriter(Console.OpenStandardOutput()))
        {
            while (true) {
                string input = sr.ReadLine();

                if (input == "0") break;

                while (input.Length > 1) 
                {
                    int sum = 0;
                    foreach (char digit in input)
                        sum += digit - '0';
                    input = sum.ToString();
                }

                sw.WriteLine(input);
            }
        }
    }
}
