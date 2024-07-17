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
            int N = int.Parse(sr.ReadLine());
            List<int> nums = new List<int>();

            for (int i = 0; i < N; i++)
            {
                int num = int.Parse(sr.ReadLine());
                nums.Add(num);
            }

            if (nums[nums.Count - 1] == N)
                sw.WriteLine("good job");
            else
            {
                for (int i = 1; i <= nums[nums.Count - 1]; i++)
                    if (!nums.Contains(i))
                        sw.WriteLine(i);
            }

            sw.Flush();
            sw.Close();
            sr.Close();
        }
    }
}
