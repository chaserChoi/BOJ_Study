using System;
using System.IO;

class Program
{
    static void Main(string[] args)
    {
        using (TextReader sr = new StreamReader(Console.OpenStandardInput()))
        using (TextWriter sw = new StreamWriter(Console.OpenStandardOutput()) { AutoFlush = false })
        {
            int n = int.Parse(Console.ReadLine());
            List<(int, int)> shifts = new List<(int, int)>();

            for (int i = 0; i < n; i++)
            {
                string[] input = Console.ReadLine().Split();
                shifts.Add((int.Parse(input[0]), int.Parse(input[1])));
            } 

            int[] t = new int[1000];
            int zero = 0;

            foreach (var (l, r) in shifts)
            {
                for (int j = l; j < r; j++)
                    t[j]++;
            }

            for (int i = 0; i < 1000; i++)
                if (t[i] == 0)
                    zero++;

            int ans = 0;
            foreach (var (l, r) in shifts)
                ans = Math.Max(ans, Calc(t, l, r));

            Console.WriteLine(ans - zero);

            sw.Flush();
            sw.Close();
            sr.Close();
        }
    }

    static int Calc(int[] t, int l, int r)
    {
        int ret = 1000;
        for (int i = l; i < r; i++)
            if (t[i] == 1)
                ret--;

        return ret;
    }
}
