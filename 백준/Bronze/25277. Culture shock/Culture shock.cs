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
            var line = sr.ReadLine();
            int n = int.Parse(line);
            string[] words = sr.ReadLine().Split();

            HashSet<string> forbids = new HashSet<string>{ "he", "him", "she", "her" };
            int cnt = 0;

            foreach (var word in words)
            {
                if (forbids.Contains(word))
                    cnt++;
            }

            sw.WriteLine(cnt);

            sw.Flush();
            sw.Close();
            sr.Close();
        }
    }
}
