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
            int N = int.Parse(sr.ReadLine());
            while (true) {
                if (N == 0) break;

                string[] input = sr.ReadLine().Split(' ');
                int num1 = int.Parse(ReverseString(input[0]));
                int num2 = int.Parse(ReverseString(input[1]));
                int sum = num1 + num2;
                sw.WriteLine(int.Parse(ReverseString(sum.ToString())));

                N--;
            }

            sw.Flush();
        }
    }

    static string ReverseString(string s)
    {
        char[] arr = s.ToCharArray();
        Array.Reverse(arr);

        return new string(arr);
    }
}
