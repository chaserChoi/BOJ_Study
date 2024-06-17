using System;
using System.IO;

class Program
{
    static void Main(string[] args)
    {
        using (var sr = new StreamReader(Console.OpenStandardInput()))
        using (var sw = new StreamWriter(Console.OpenStandardOutput()) { AutoFlush = false })
        {
            while (true)
            {
                var input = sr.ReadLine().Split();
                var l = int.Parse(input[0]);
                var w = int.Parse(input[1]);
                var a = int.Parse(input[2]);

                if (l == 0 && w == 0 && a == 0) break;

                if (l == 0) 
                    l = a / w;
                else if (w == 0)
                    w = a / l;
                else
                    a = l * w;

                sw.WriteLine($"{l} {w} {a}");
            }

            sw.Close();
            sr.Close();
        }
    }
}
