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
            int T = int.Parse(sr.ReadLine());
            for (int i = 0; i < T; i++)
            {
                string[] input = sr.ReadLine().Split();
                int N = int.Parse(input[0]);
                int C = int.Parse(input[1]);
                
                int days = N / C;
                if (N % C != 0)
                    days++;

                sw.WriteLine(days);
            }

            sw.Flush();
            sw.Close();
            sr.Close();
        }
    }
}
