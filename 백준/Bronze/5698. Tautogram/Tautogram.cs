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
            string s;
            while ((s = sr.ReadLine()) != "*")
            {
                StringBuilder sb = new StringBuilder(s);
                for (int i = 0; i < sb.Length; i++)
                {
                    if (sb[i] >= 'A' && sb[i] <= 'Z')
                        sb[i] = (char)(sb[i] - 'A' + 'a');
                }
                s = sb.ToString();

                string[] words = s.Split();
                char firstChar = words[0][0];
                bool valid = true;
                for (int i = 1; i < words.Length; i++)
                {
                    if (words[i][0] != firstChar)
                    {
                        Console.WriteLine("N");
                        valid = false;
                        break;
                    }
                }

                if (valid == true)
                    Console.WriteLine("Y");
            }

            sw.Flush();
            sw.Close();
            sr.Close();
        }
    }
}
