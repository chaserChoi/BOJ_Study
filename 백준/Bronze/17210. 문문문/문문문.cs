using System;
using System.IO;

class Program
{
    static void Main(string[] args)
    {
        using (var sr = new StreamReader(Console.OpenStandardInput()))
        using (var sw = new StreamWriter(Console.OpenStandardOutput()) { AutoFlush = true } )
        {
            long N = long.Parse(sr.ReadLine());
            int first = int.Parse(sr.ReadLine());

            if (N > 5)
            {
                sw.WriteLine("Love is open door");
                return;
            }

            for (int i = 0; i < N - 1; i++)
            {
                if (first == 0)
                {
                    sw.WriteLine(1);
                    first = 1;
                } else
                {
                    sw.WriteLine(0);
                    first = 0;
                }
            }

            sw.Flush();
            sw.Close();
            sr.Close();
        }
    }
}
