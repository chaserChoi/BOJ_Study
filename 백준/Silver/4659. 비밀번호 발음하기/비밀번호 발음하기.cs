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
            char[] vowel = { 'a', 'e', 'i', 'o', 'u' };
            bool flag = true;

            string s = string.Empty;
            StringBuilder sb = new StringBuilder();

            while (true) 
            {
                s = sr.ReadLine();
                bool[] word = new bool[s.Length];
                flag = true;

                if (s  == "end") break;

                for (int i = 0; i < s.Length; i++)
                {
                    for (int j = 0; j < vowel.Length; j++)
                    {
                        if (s[i] == vowel[j])
                            word[i] = true;
                    }
                }

                for (int i = 0; i < word.Length; i++)
                {
                    if (word.Length >= 2 && i < s.Length - 1)
                    {
                        if (s[i] == s[i + 1])
                        {
                            if (s[i] == 'e' || s[i] == 'o')
                                continue;
                            flag = false;
                        }
                    }

                    if (word.Length >= 3 && i < s.Length - 2)
                    {
                        if (word[i] == word[i + 1] && word[i + 1] == word[i + 2])
                            flag = false;
                    }
                }

                if (word.All(x => x == false))
                    flag = false;

                sb.AppendLine(flag ? $"<{s}> is acceptable." : $"<{s}> is not acceptable.");
            }

            sw.Write(sb);

            sw.Flush();
            sw.Close();
            sr.Close();
        }
    }
}
