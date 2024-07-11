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
            int M = int.Parse(line[1]);

            line = sr.ReadLine().Split();
            long[] nums = new long[N];
            for (int i = 0; i < N; i++)
                nums[i] = long.Parse(line[i]);

            long ans = 1;
            for (int i = 0; i < N; i++)
                ans = (ans * nums[i]) % M;

            sw.WriteLine(ans);

            sw.Flush();
            sw.Close();
            sr.Close();
        }
    }
}
