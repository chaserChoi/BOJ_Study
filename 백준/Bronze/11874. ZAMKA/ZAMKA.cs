using System;
using System.IO;

class Program
{
    static void Main(string[] args)
    {
        StreamReader sr = new StreamReader(Console.OpenStandardInput());
        StreamWriter sw = new StreamWriter(Console.OpenStandardOutput());

        int l = int.Parse(sr.ReadLine());
        int d = int.Parse(sr.ReadLine());
        int x = int.Parse(sr.ReadLine());

        for (int i = l; i <= d; i++)
        {
            if (getSum(i) == x)
            {
                sw.WriteLine(i);
                break;
            }
        }

        for (int i = d; i >= l; i--)
        {
            if (getSum(i) == x)
            {
                sw.WriteLine(i);
                break;
            }
        }

        sw.Flush();
    }

    static int getSum(int num)
    {
        int sum = 0;
        while (num > 0)
        {
            sum += num % 10;
            num /= 10;
        }

        return sum;
    }
}
