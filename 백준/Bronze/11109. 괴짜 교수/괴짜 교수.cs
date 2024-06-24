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
                int d = int.Parse(input[0]);
                int n = int.Parse(input[1]);
                int s = int.Parse(input[2]);
                int p = int.Parse(input[3]);

                int serial = n * s;
                int parallel = d + n * p;

                if (serial < parallel)
                    sw.WriteLine("do not parallelize");
                else if (serial > parallel)
                    sw.WriteLine("parallelize");
                else
                    sw.WriteLine("does not matter");
            }

            sw.Flush();
            sw.Close();
            sr.Close();
        }
    }
}
