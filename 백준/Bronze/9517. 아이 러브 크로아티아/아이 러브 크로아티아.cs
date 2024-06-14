using System;
using System.IO;

class Program
{
    static void Main(string[] args)
    {
        using (StreamReader sr = new StreamReader(Console.OpenStandardInput()))
        using (StreamWriter sw = new StreamWriter(Console.OpenStandardOutput()) { AutoFlush = false })
        {
            int K = int.Parse(sr.ReadLine());
            int N = int.Parse(sr.ReadLine());
            int time = 0;

            for (int i = 0; i < N; i++)
            {
                string[] input = sr.ReadLine().Split();
                int T = int.Parse(input[0]);
                string Z = input[1];

                time += T;

                if (time > 210)
                    break;
                if (Z.Equals("T"))
                    K++;
                if (K == 9)
                    K = 1;
            }

            sw.WriteLine(K);

            sw.Close();
            sr.Close();
        }
    }
}
