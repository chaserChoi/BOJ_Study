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
            string[] firstD = sr.ReadLine().Split();
            int d1 = int.Parse(firstD[0]);
            int m1 = int.Parse(firstD[1]);
            int y1 = int.Parse(firstD[2]);
            int n1 = int.Parse(firstD[3]);

            string[] secondD = sr.ReadLine().Split();
            int d2 = int.Parse(secondD[0]);
            int m2 = int.Parse(secondD[1]);
            int y2 = int.Parse(secondD[2]);

            sw.WriteLine((d2 - d1 + (m2 - m1) * 30 + (y2 - y1) * 360 + n1 - 1) % 7 + 1);

            sw.Flush();
            sw.Close();
            sr.Close();
        }
    }
}
