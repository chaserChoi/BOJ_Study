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
            string[] input = sr.ReadLine().Split();
            double[] a = { double.Parse(input[0]), double.Parse(input[1]) };

            Array.Sort(a);
            double ans;
            if (a[0] * 3 < a[1])
                ans = a[0];
            else if (a[0] * 1.5 < a[1])
                ans = a[1] / 3;
            else
                ans = a[0] / 2;

            sw.WriteLine("{0:F3}", ans);

            sw.Flush();
            sw.Close();
            sr.Close();
        }
    }
}
