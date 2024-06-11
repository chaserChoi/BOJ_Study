using System;
using System.IO;

class Program
{
    static void Main(string[] args)
    {
        using (StreamReader sr = new StreamReader(Console.OpenStandardInput()))
        using (StreamWriter sw = new StreamWriter(Console.OpenStandardOutput()) { AutoFlush = false })
        {
            int T = int.Parse(sr.ReadLine());

            for (int i = 0; i < T; i++)
            {
                string[] inputs = sr.ReadLine().Split(' ');
                int n = int.Parse(inputs[0]);
                int m = int.Parse(inputs[1]);
                int cnt = 0;

                for (int j = 1; j < n; j++)
                {
                    for (int k = j + 1; k < n; k++)
                    {
                        if ((j * j + k * k + m) % (j * k) == 0)
                            cnt++;
                    }
                }

                sw.WriteLine(cnt);
            }

            sw.Close();
            sr.Close();
        }
    }
}