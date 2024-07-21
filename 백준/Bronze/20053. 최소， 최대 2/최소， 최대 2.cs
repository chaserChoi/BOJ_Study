using System;
using System.IO;
using System.Text;

class Program
{
    static void Main(string[] args)
    {
        using (var sr = new StreamReader(Console.OpenStandardInput()))
        using (var sw = new StreamWriter(Console.OpenStandardOutput()) { AutoFlush = true })
        {
            int t = int.Parse(sr.ReadLine());

            for (int i = 0; i < t; i++)
            {
                int n = int.Parse(sr.ReadLine());

                string[] nums = sr.ReadLine().Split();
                int min = int.MaxValue;
                int max = int.MinValue;

                for (int j = 0; j < n; j++)
                {
                    int num = int.Parse(nums[j]);
                    if (num < min)
                        min = num;
                    if (num > max)
                        max = num;
                }

                sw.WriteLine($"{min} {max}");
            }

            sw.Flush();
            sw.Close();
            sr.Close();
        }
    }
}
