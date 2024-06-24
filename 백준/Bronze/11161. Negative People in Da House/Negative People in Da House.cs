using System;
using System.IO;
using System.Text;

class Program
{
    static void Main(string[] args) 
    {
        using (TextReader sr = new StreamReader(Console.OpenStandardInput()))
        using (TextWriter sw = new StreamWriter(Console.OpenStandardOutput()) { AutoFlush = false })
        {
            int T = int.Parse(sr.ReadLine());
            for (int i = 0; i < T; i++)
            {
                int m = int.Parse(sr.ReadLine());
                int ans = 0;
                int curr = 0;

                for (int j = 0; j < m; j++)
                {
                    string[] input = sr.ReadLine().Split();
                    int p1 = int.Parse(input[0]);
                    int p2 = int.Parse(input[1]);
                    curr = curr - p1 + p2;
                    ans = Math.Max(ans, curr);
                }

                sw.WriteLine(ans);
            }

            sw.Flush();
            sw.Close();
            sr.Close();
        }
    }
}
