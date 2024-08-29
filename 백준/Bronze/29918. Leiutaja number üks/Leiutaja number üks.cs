using System;
using System.Globalization;
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
            int n0 = int.Parse(line[0]);
            int m0 = int.Parse(line[1]);

            int[] comp = new int[5];

            for (int i = 0; i < 5; i++)
            {
                line = sr.ReadLine().Split();
                int ni = int.Parse(line[0]);
                int mi = int.Parse(line[1]);

                comp[i] = ni + mi * 10;
            }

            int adalbert = n0 + m0 * 10;

            int max = 0;
            for (int i = 0; i < 5; i++)
            {
                if (comp[i] > max)
                    max = comp[i];
            }
            
            int required = max - adalbert + 1;

            if (required < 0)
                required = 0;

            sw.WriteLine(required);

            sw.Flush();
            sw.Close();
            sr.Close();
        }
    }
}
