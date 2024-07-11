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
            int L = int.Parse(line[0]);
            int R = int.Parse(line[1]);
            int A = int.Parse(line[2]);

            while (A-- > 0)
            {
                if (L < R)
                    L++;
                else
                    R++;
            }

            sw.WriteLine(Math.Min(L, R) * 2);

            sw.Flush();
            sw.Close();
            sr.Close();
        }
    }
}
