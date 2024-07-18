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
            int cnt = 0;

            for (int i = 1; i <= n; i++)
            {
                int sum = 0;
                int temp = i;

                while (temp > 0)
                {
                    sum += temp % 10;
                    temp /= 10;
                }

                if (i % sum == 0)
                    cnt++;
            }

            sw.WriteLine(cnt);

            sw.Flush();
            sw.Close();
            sr.Close();
        }
    }
}
