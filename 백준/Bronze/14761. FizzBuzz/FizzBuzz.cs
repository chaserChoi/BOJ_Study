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
            string[] line = sr.ReadLine().Split();
            int X = int.Parse(line[0]);
            int Y = int.Parse(line[1]);
            int N = int.Parse(line[2]);

            for (int i = 1; i <= N; i++) 
            {
                if (i % X == 0 && i % Y == 0)
                    sw.WriteLine("FizzBuzz");
                else if (i % X == 0)
                    sw.WriteLine("Fizz");
                else if (i % Y == 0)
                    sw.WriteLine("Buzz");
                else
                    sw.WriteLine(i);
            }

            sw.Flush();
            sw.Close();
            sr.Close();
        }
    }
}
