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
            int[][] k = new int[n][];
            for (int i = 0; i < n; i++)
                k[i] = Array.ConvertAll(sr.ReadLine().Split(), int.Parse);

            long ans = 0;
            for (int i = 0; i < n; i++)
            {
                for (int j = 0; j < n; j++)
                    ans += k[i][j];
            }

            sw.WriteLine(ans);

            sw.Flush();
            sw.Close();
            sr.Close();
        }
    }
}
