using System;
using System.IO;
using System.Text;

class Program
{
    static void Main(string[] args)
    {
        using (var sr = new StreamReader(Console.OpenStandardInput()))
        using (var sw = new StreamWriter(Console.OpenStandardOutput()))
        {
            int wordL = int.Parse(sr.ReadLine());
            string word = sr.ReadLine();

            int[] charCnt = new int[26];

            for (int i = 0; i < wordL; i++)
                charCnt[word[i] - 'a']++;

            int maxCnt = 0;
            char maxChar = 'a';

            for (int i = 0; i < 26; i++)
            {
                if (charCnt[i] > maxCnt)
                {
                    maxCnt = charCnt[i];
                    maxChar = (char)('a' + i);
                }
            }

            sw.WriteLine($"{maxChar} {maxCnt}");

            sw.Flush();
            sw.Close();
            sr.Close();
        }
    }
}
