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
            string line;

            while ((line = sr.ReadLine()) != null)
            {
                string[] parts = line.Split();
                int[] nums = Array.ConvertAll(parts, int.Parse);
                int len = nums.Length;
                int[] scaled = new int[len];

                for (int i = 0; i < len; i++)
                {
                    int left = (i > 0) ? nums[i - 1] : 1;
                    int right = (i < len - 1) ? nums[i + 1] : 1;
                    scaled[i] = nums[i] * left * right;
                }

                sw.WriteLine(string.Join(" ", scaled));
            }

            sw.Flush();
            sw.Close();
            sr.Close();
        }
    }
}
