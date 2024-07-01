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
            for (int i = 0; i < T; i++)
            {
                int n = int.Parse(sr.ReadLine());

                int ans = 0;
                while (n-- > 0) {
                    string[] input = sr.ReadLine().Split();
                    int a = int.Parse(input[0]);
                    int b = int.Parse(input[1]);
                    int c = int.Parse(input[2]);

                    if (Math.Max(a, Math.Max(b, c)) < 0)
                        continue;
                    ans += Math.Max(a, Math.Max(b, c));
                }

                sw.WriteLine(ans);
            }

            sw.Flush();
            sw.Close();
            sr.Close();
        }
    }
}
