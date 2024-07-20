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
            var line = sr.ReadLine().Split();
            int n = int.Parse(line[0]);
            int a = int.Parse(line[1]);
            int b = int.Parse(line[2]);
            string s = sr.ReadLine();

            int startIdx = a - 1;
            int endIdx = b - 1;

            char[] charArr = s.ToCharArray();

            Array.Reverse(charArr, startIdx, endIdx - startIdx + 1);

            sw.WriteLine(new string(charArr));

            sw.Flush();
            sw.Close();
            sr.Close();
        }
    }
}
