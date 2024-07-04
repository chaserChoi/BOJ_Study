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
            string[] line = sr.ReadLine().Split();
            int N = int.Parse(line[0]);
            int C = int.Parse(line[1]);
            int S = int.Parse(line[2]);

            int[] x = new int[C];
            line = sr.ReadLine().Split();
            for (int i = 0; i < C; i++)
                x[i] = int.Parse(line[i]);

            int ans = (S == 1 ? 1 : 0);
            int cur = 1;
            for (int i = 0; i < C; i++)
            {
                cur += x[i];
                if (cur > N)
                    cur = 1;
                if (cur < 1)
                    cur = N;
                if (cur == S)
                    ans++;
            }

            sw.WriteLine(ans);

            sw.Flush();
            sw.Close();
            sr.Close();
        }
    }
}
