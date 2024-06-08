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
            int N = int.Parse(sr.ReadLine());
            string sequence = sr.ReadLine();

            string[] romanNumerals = { "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X", "XI", "XII" };

            StringBuilder result = new StringBuilder();

            for (int i = 0; i < romanNumerals.Length; i++)
                if (sequence.Contains(romanNumerals[i]))
                    result.Append(i + 1).Append(" ");

            sw.WriteLine(result.ToString().TrimEnd());
        }
    }
}