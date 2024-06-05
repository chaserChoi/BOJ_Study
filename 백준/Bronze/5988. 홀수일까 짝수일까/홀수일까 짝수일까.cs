using System;
using System.IO;

class Program
{
    static void Main()
    {
        using (var sr = new StreamReader(Console.OpenStandardInput()))
        using (var sw = new StreamWriter(Console.OpenStandardOutput()))
        {
            int N = int.Parse(sr.ReadLine());
            
            for (int i = 0; i < N; i++)
            {
                string num = sr.ReadLine();
                
                char lastDigit = num[num.Length - 1];
                
                if (lastDigit % 2 == 0)
                    sw.WriteLine("even");
                else
                    sw.WriteLine("odd");
            }
        }
    }
}
