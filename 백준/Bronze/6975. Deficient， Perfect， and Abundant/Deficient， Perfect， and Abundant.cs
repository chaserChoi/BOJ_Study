using System;
using System.IO;

class Program
{
    static void Main(string[] args)
    {
        using (StreamReader sr = new StreamReader(Console.OpenStandardInput()))
        using (StreamWriter sw = new StreamWriter(Console.OpenStandardOutput()))
        {
            int t = int.Parse(sr.ReadLine());

            for (int i = 0; i  < t; i++)
            {
                int num = int.Parse(sr.ReadLine());
                int sumOfDivisors = SumOfProperDivisors(num);

                if (sumOfDivisors == num)
                    sw.WriteLine($"{num} is a perfect number.");
                else if (sumOfDivisors < num)
                    sw.WriteLine($"{num} is a deficient number.");
                else 
                    sw.WriteLine($"{num} is an abundant number.");
                sw.WriteLine();
            }

            sw.Flush();
        }
    }

    static int SumOfProperDivisors(int num)
    {
        int s = 1;
        for (int i = 2; i * i <= num; i++)
        {
            if (num % i == 0)
            {
                s += i;
                int other = num / i;
                if (other != i)
                    s += other;
            }
        }

        return s;
    }
}