using System;
using System.Globalization;
using System.IO;
using System.Text;

class Program
{
    static void Main(string[] args)
    {
        using (var sr = new StreamReader(Console.OpenStandardInput()))
        using (var sw = new StreamWriter(Console.OpenStandardOutput()) { AutoFlush = true })
        {
            int n = int.Parse(sr.ReadLine());
            var nums = Array.ConvertAll(sr.ReadLine().Split(), int.Parse);

            int total = 0;
            foreach (var num in nums)
                total += num;

            for (int i = 0; i < n; i++)
            {
                int remain = total - nums[i];
                if (remain == nums[i])
                {
                    sw.WriteLine(i + 1);
                    break;
                }
            }

            sw.Flush();
            sw.Close();
            sr.Close();
        }
    }
}
