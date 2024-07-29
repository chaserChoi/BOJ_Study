using System;
using System.Globalization;
using System.IO;
using System.Text;

class Program
{
    static void Main(string[] args)
    {
        using (var sr = new StreamReader(Console.OpenStandardInput()))
        using (var sw = new StreamWriter(Console.OpenStandardOutput()) { AutoFlush = true })
        {
            int k = int.Parse(sr.ReadLine());
            string s = sr.ReadLine();

            for (int i = 0; i < s.Length; i += k)
                sw.Write(s[i]);            

            sw.Flush();
            sw.Close();
            sr.Close();
        }
    }
}
