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
            int N = int.Parse(sr.ReadLine());

            for (int i = 0; i < N; i++)
            {
                string[] line = sr.ReadLine().Split();
                int a = int.Parse(line[0]);
                int b = int.Parse(line[1]);
                int c = int.Parse(line[2]);

                if (a + b + c == 180)
                    sw.WriteLine($"{a} {b} {c} Seems OK");
                else
                    sw.WriteLine($"{a} {b} {c} Check");
            }

            sw.Flush();
            sw.Close();
            sr.Close();
        }
    }
}
