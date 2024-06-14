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
            for (int i = 0; i < T; i++)
            {
                string[] tokens = sr.ReadLine().Split();
                int N = int.Parse(tokens[0]);
                int K = int.Parse(tokens[1]);
                int count = 0;

                tokens = sr.ReadLine().Split();
                for (int j = 0; j < N; j++)
                {
                    int candy = int.Parse(tokens[j]);
                    count += candy / K;
                }

                sb.AppendLine(count.ToString());
            }

            sw.Write(sb);


            sw.Close();
            sr.Close();
        }
    }
}
