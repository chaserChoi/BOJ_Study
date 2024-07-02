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
            int T = int.Parse(sr.ReadLine());
            while (T-- > 0)
            {
                int n = int.Parse(sr.ReadLine());
                string[] vline = sr.ReadLine().Split();
                string[] uline = sr.ReadLine().Split();

                int[] v = new int[n];
                int[] u = new int[n];

                for (int i = 0; i < n; i++)
                {
                    v[i] = int.Parse(vline[i]);
                    u[i] = int.Parse(uline[i]);
                }

                int dist = 0;
                for (int i = 0; i < n; i++)
                    if (v[i] != u[i])
                        dist++;

                sw.WriteLine(dist);
            }

            sw.Flush();
            sw.Close();
            sr.Close();
        }
    }
}
