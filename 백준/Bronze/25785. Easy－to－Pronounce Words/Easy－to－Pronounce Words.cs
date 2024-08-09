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
            string word = sr.ReadLine();
            string vowels = "aeiou";
            int len = word.Length;

            for (int i = 0; i < len; i++)
            {
                bool isCurVowel = vowels.Contains(word[i]);

                if (i < len - 1)
                {
                    bool isNextVowel = vowels.Contains(word[i + 1]);

                    if (isCurVowel && isNextVowel)
                    {
                        sw.WriteLine(0);
                        return;
                    }

                    if (!isCurVowel && !isNextVowel)
                    {
                        sw.WriteLine(0);
                        return;
                    }
                }
            }

            sw.WriteLine(1);

            sw.Flush();
            sw.Close();
            sr.Close();
        }
    }
}
