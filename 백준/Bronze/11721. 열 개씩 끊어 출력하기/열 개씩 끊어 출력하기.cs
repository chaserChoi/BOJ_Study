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
            string word = sr.ReadLine();
            for (int i = 0; i < word.Length; i++) {
                sw.Write(word[i]);

                if (i % 10 == 9)
                    sw.WriteLine();
            }

            sw.Flush();
            sr.Close();
            sw.Close();
        }
    }
}
