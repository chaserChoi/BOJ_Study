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
            string[] input = sr.ReadLine().Split();
            int N = int.Parse(input[0]);
            int W = int.Parse(input[1]);
            int H = int.Parse(input[2]);

            for (int i = 0; i < N; i++)
            {
                int len = int.Parse(sr.ReadLine());
                if (len * len <= W * W + H * H)
                    sw.WriteLine("YES");
                else
                    sw.WriteLine("NO");
            }

            sw.Flush();
            sw.Close();
            sr.Close();
        }
    }
}
