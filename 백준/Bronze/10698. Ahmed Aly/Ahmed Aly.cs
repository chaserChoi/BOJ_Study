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

            for (int i = 1; i <= T; i++)
            {
                string[] input = sr.ReadLine().Split();
                int X = int.Parse(input[0]);
                char op = input[1][0];
                int Y = int.Parse(input[2]);
                int Z = int.Parse(input[4]);

                bool flag = false;
                if (op == '+')
                    flag = (X + Y == Z);
                else
                    flag = (X - Y == Z);

                sw.WriteLine($"Case {i}: {(flag ? "YES" : "NO")}");
            }

            sw.Flush();
            sw.Close();
            sr.Close();
        }
    }
}
