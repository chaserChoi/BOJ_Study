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
            string[] line = sr.ReadLine().Split();
            int n = int.Parse(line[0]);
            int r = int.Parse(line[1]);
            int s = int.Parse(line[2]);

            for (int i = 0; i < n; i++)
            {
                int[] v = new int[s];

                for (int j = 0; j < r; j++)
                {
                    string str = sr.ReadLine();
                    for (int k = 0; k < s; k++)
                    {
                        if (str[k] == '#')
                            v[k] = r - j;
                    }
                }

                int max = int.MinValue;
                int min = int.MaxValue;

                for (int j = 0; j < s; j++)
                {
                    if (v[j] > max)
                        max = v[j];
                    if (v[j] < min)
                        min = v[j];
                }

                sw.WriteLine(max - min);
            }

            sw.Flush();
            sw.Close();
            sr.Close();
        }
    }
}
