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
            string line = sr.ReadLine();
            string[] nums = line.Split(' ');

            int y = int.Parse(nums[0]);
            int m = int.Parse(nums[1]);

            int ans = 0;

            for (int i = 0; i < 12 && i < 12 * y + m; i++) 
                ans += 15;
            for (int i = 12; i < 24 && i < 12 * y + m; i++) 
                ans += 9;
            for (int i = 24; i < 12 * y + m; i++) 
                ans += 4;

            sw.WriteLine(ans / 12 + " " + ans % 12);

            sw.Flush();
            sw.Close();
            sr.Close();
        }
    }
}
