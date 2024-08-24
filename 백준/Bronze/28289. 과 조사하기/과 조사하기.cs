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
            int p = int.Parse(sr.ReadLine());

            int soft = 0;
            int emb = 0;
            int ai = 0;
            int noFirst = 0;

            for (int i = 0; i < p; i++)
            {
                string[] line = sr.ReadLine().Split();
                int g_p = int.Parse(line[0]);
                int c_p = int.Parse(line[1]);
                int n_p = int.Parse(line[2]);

                if (g_p == 1)
                    noFirst++;
                else if (c_p <= 2)
                    soft++;
                else if (c_p == 3)
                    emb++;
                else if (c_p == 4)
                    ai++;
            }

            sw.WriteLine(soft);
            sw.WriteLine(emb);
            sw.WriteLine(ai);
            sw.WriteLine(noFirst);

            sw.Flush();
            sw.Close();
            sr.Close();
        }
    }
}
