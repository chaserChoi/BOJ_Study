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
            var line = sr.ReadLine().Split().Select(int.Parse).ToArray();
            int a = line[0];
            int b = line[1];
            int c = line[2];
            int d = line[3];

            int[] nums = { a, b, c, d };
            Array.Sort(nums);

            sw.WriteLine($"{nums[0]} {nums[2]} {nums[1]} {nums[3]}");

            sw.Flush();
            sw.Close();
            sr.Close();
        }
    }
}
