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
            string[] line = sr.ReadLine().Split();
            long a = long.Parse(line[0]);
            long b = long.Parse(line[1]);
            long c = long.Parse(line[2]);

            if (a > b) 
            {
                long temp = a;
                a = b; 
                b = temp;
            }
            if (a > c) 
            {
                long temp = a;
                a = c; 
                c = temp;
            }
            if (b > c) 
            {
                long temp = b;
                b = c; 
                c = temp;
            }

            sw.WriteLine(b != 0 ? a + b * c : c);

            sw.Flush();
            sw.Close();
            sr.Close();
        }
    }
}
