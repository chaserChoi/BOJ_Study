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
            StringBuilder output = new StringBuilder();

            foreach (char c in input) {
                if (char.IsLetter(c)) {
                    if (char.IsLower(c)) 
                        output.Append(string.Format("{0:D2}", (int)(c - 'a') + 1));
                    else
                        output.Append(string.Format("{0:D2}", (int)(c - 'A') + 27));
                } else if (char.IsDigit(c)) 
                    output.Append("#" + c);
                else 
                    output.Append(c);
            }

            sw.WriteLine(output.ToString());

            sw.Close();
            sr.Close();
        }
    }
}
