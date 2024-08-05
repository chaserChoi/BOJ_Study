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
            int n = int.Parse(sr.ReadLine());

            while (n-- > 0)
            {
                string[] line = sr.ReadLine().Split();
                int a = int.Parse(line[0]);
                int b = int.Parse(line[1]);
                int c = int.Parse(line[2]);
                bool pos = false;

                if (a + b == c || a - b == c || b - a == c || a * b == c)
                    pos = true;

                if (b != 0 && a / b == c && a % b == 0)
                    pos = true;

                if (a != 0 && b / a == c && b % a == 0)
                    pos = true;

                sw.WriteLine(pos ? "Possible" : "Impossible");
            }

            sw.Flush();
            sw.Close();
            sr.Close();
        }
    }
}
