using System;
using System.Formats.Asn1;
using System.IO;

class Program
{
    static void Main(string[] args)
    {
        using (var sr = new StreamReader(Console.OpenStandardInput()))
        using (var sw = new StreamWriter(Console.OpenStandardOutput()) { AutoFlush = true } )
        {
            int T = int.Parse(sr.ReadLine());
            while (true) {
                if (T == 0) break;

                string input = sr.ReadLine();
                char[] inputArr = input.ToCharArray();
                Array.Reverse(inputArr);
                string reversedInput = new string(inputArr);
                sw.WriteLine(reversedInput);

                T--;
            }

            sw.Flush();
        }
    }
}
