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
            int n = int.Parse(sr.ReadLine());

            while (!Harshad(n))
                n++;
            
            sw.WriteLine(n);

            sw.Flush();
            sw.Close();
            sr.Close();
        }
    }

    static bool Harshad(int n) 
    {
        int sum = 0;

        for (int i = n; i > 0; i /= 10) 
            sum += i % 10;

        return n % sum == 0;
    }
}
