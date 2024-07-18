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
            int ans = 0;

            for (int i = 1; i <= n; i++) 
            {
                int cnt = 0;
                int temp = i;
                while (temp > 0)
                {
                    int digit = temp % 10;
                    if (digit == 3 || digit == 6 || digit == 9)
                        cnt++;
                    temp /= 10;
                }

                ans += cnt;
            }

            sw.WriteLine(ans);

            sw.Flush();
            sw.Close();
            sr.Close();
        }
    }
}
