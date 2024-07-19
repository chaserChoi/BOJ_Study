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
            string[] line = sr.ReadLine().Split();
            int a = int.Parse(line[0]);
            int b = int.Parse(line[1]);

            if (a * a == b)
                sw.WriteLine(-a);
            else
                sw.WriteLine((-a - Math.Sqrt(a * a - b)) + " " + (-a + Math.Sqrt(a * a - b)));

            sw.Flush();
            sw.Close();
            sr.Close();
        }
    }
}
