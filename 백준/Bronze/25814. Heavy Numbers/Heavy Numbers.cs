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

            int a = int.Parse(nums[0]);
            int b = int.Parse(nums[1]);

            int wA = CalcW(a);
            int wB = CalcW(b);

            if (wA > wB)
                sw.WriteLine(1);
            else if (wA < wB)
                sw.WriteLine(2);
            else
                sw.WriteLine(0);

            sw.Flush();
            sw.Close();
            sr.Close();
        }
    }

    static int CalcW(int num)
    {
        int sumOfDigits = 0;
        int cntOfDigits = 0;

        while (num > 0)
        {
            sumOfDigits += num % 10; 
            num /= 10; 
            cntOfDigits++;
        }

        return cntOfDigits * sumOfDigits;
    }
}
