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

            for (int i = 0; i < n + 2; i++)
                sw.Write("@");
            sw.WriteLine();

            for (int i = 0; i < n; i++)
            {
                sw.Write("@");
                for (int j = 0; j < n; j++)
                    sw.Write(" ");
                sw.Write("@");
                sw.WriteLine();
            }

            for (int i = 0; i < n + 2; i++)
                sw.Write("@");
            sw.WriteLine();

            sw.Flush();
            sw.Close();
            sr.Close();
        }
    }
}
