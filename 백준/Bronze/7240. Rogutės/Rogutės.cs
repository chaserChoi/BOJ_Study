using System;
using System.IO;

class Program
{
    static void Main(string[] args)
    {
        using (StreamReader sr = new StreamReader(Console.OpenStandardInput()))
        using (StreamWriter sw = new StreamWriter(Console.OpenStandardOutput()) { AutoFlush = false })
        {
            string[] input = sr.ReadLine().Split(' ');
            int n = int.Parse(input[0]);
            int s = int.Parse(input[1]);

            int ans = 0;
            for (int i = 0; i < n; i++)
            {
                int a = int.Parse(sr.ReadLine());
                if (ans > s) ans--;
                ans += a;
            }

            sw.WriteLine(ans);

            sr.Close();
            sw.Close();
        }
    }
}