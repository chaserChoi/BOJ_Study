using System;
using System.IO;
using System.Text;

class Program
{
    static void Main(string[] args) 
    {
        using (TextReader sr = new StreamReader(Console.OpenStandardInput()))
        using (TextWriter sw = new StreamWriter(Console.OpenStandardOutput()) { AutoFlush = false })
        {
            int N = int.Parse(sr.ReadLine());
            double sum = 0;

            for (int i = 0; i < N; i++)
            {
                int temp = int.Parse(sr.ReadLine());

                sum += Math.Pow(temp / 10, temp % 10);
            }

            sw.WriteLine(sum);

            sw.Flush();
            sr.Close();
            sw.Close();
        }
    }
}
