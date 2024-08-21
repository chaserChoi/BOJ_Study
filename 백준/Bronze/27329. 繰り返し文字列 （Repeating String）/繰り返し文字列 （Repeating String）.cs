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
            int n = int.Parse(sr.ReadLine());
            string s = sr.ReadLine();

            int l = n / 2;
            string fir = s.Substring(0, l);
            string sec = s.Substring(l);

            if (fir == sec)
                sw.WriteLine("Yes");
            else
                sw.WriteLine("No");

            sw.Flush();
            sw.Close();
            sr.Close();
        }
    }
}
