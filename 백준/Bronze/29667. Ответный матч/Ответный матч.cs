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
            string[] first = sr.ReadLine().Split(':');
            int a1 = int.Parse(first[0]);
            int b1 = int.Parse(first[1]);

            string[] second = sr.ReadLine().Split(':');
            int a2 = int.Parse(second[0]);
            int b2 = int.Parse(second[1]);

            if (a2 <= a1 && b2 <= b1)
                sw.WriteLine("YES");
            else
                sw.WriteLine("NO");

            sw.Flush();
            sw.Close();
            sr.Close();
        }
    }
}
