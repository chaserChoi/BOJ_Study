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
            int n = int.Parse(sr.ReadLine());
            int[] line = Array.ConvertAll(sr.ReadLine().Split(), int.Parse);

            int min = line[0];
            int minDay = 0;

            for (int i = 1; i < n; i++)
            {
                if (line[i] < min)
                {
                    min = line[i];
                    minDay = i;
                }
            }

            sw.WriteLine(minDay);

            sw.Flush();
            sw.Close();
            sr.Close();
        }
    }
}
