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
            int C1 = int.Parse(sr.ReadLine());
            int n = 1;
            int Cn = C1;

            while (Cn != 1)
            {
                if (Cn % 2 == 0)
                    Cn /= 2;
                else 
                    Cn = 3 * Cn + 1;
                n++;
            }

            sw.WriteLine(n);

            sw.Flush();
            sw.Close();
            sr.Close();
        }
    }
}
