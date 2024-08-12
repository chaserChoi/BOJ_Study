using System;
using System.IO;
using System.Text;

class Program
{
    static void Main(string[] args)
    {
        using (var sr = new StreamReader(Console.OpenStandardInput()))
        using (var sw = new StreamWriter(Console.OpenStandardOutput()) { AutoFlush = true })
        {
            int n = int.Parse(sr.ReadLine());

            while (n-- > 0)
            {
                int m = int.Parse(sr.ReadLine());

                long[] K = new long[m];
                long[] D = new long[m];
                long[] A = new long[m];

                for (int i = 0; i < m; i++)
                {
                    string[] input = sr.ReadLine().Split(' ');
                    K[i] = long.Parse(input[0]);
                    D[i] = long.Parse(input[1]);
                    A[i] = long.Parse(input[2]);
                }

                string[] result = sr.ReadLine().Split(' ');
                long k = long.Parse(result[0]);
                long d = long.Parse(result[1]);
                long a = long.Parse(result[2]);

                long total = 0; 

                for (int i = 0; i < m; i++)
                {
                    long sum = K[i] * k - D[i] * d + A[i] * a;

                    if (sum > 0)
                        total += sum; 
                }

                sw.WriteLine(total);
            }

            sw.Flush();
            sw.Close();
            sr.Close();
        }
    }
}
