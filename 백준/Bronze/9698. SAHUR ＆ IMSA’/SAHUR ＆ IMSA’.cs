using System;
using System.IO;
using System.Text;

class Program
{
    static void Main(string[] args)
    {
        using (StreamReader sr = new StreamReader(Console.OpenStandardInput()))
        using (StreamWriter sw = new StreamWriter(Console.OpenStandardOutput()) { AutoFlush = false })
        {
            StringBuilder sb = new StringBuilder();

            int T = int.Parse(sr.ReadLine());

            for (int i = 1; i <= T; i++)
            {
                string[] input = sr.ReadLine().Split();
                int H = int.Parse(input[0]);
                int M = int.Parse(input[1]);

                int newM = M - 45;
                int newH = H;

                if (newM < 0)
                {
                    newM += 60;
                    newH--;
                    if (newH < 0)
                        newH = 23;
                }

                sw.WriteLine($"Case #{i}: {newH} {newM}");
            }

            sw.Close();
            sr.Close();
        }
    }
}
