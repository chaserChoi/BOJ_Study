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
            int k = int.Parse(sr.ReadLine());
            for (int i = 1; i <= k; i++)
            {
                string[] input = sr.ReadLine().Split();
                int n = int.Parse(input[0]);
                int w = int.Parse(input[1]);
                int e = int.Parse(input[2]);

                int ans = 0;
                while (n-- > 0)
                {
                    string[] line = sr.ReadLine().Split();
                    int lww = int.Parse(line[0]);
                    int lwe = int.Parse(line[1]);
                    int lew = int.Parse(line[2]);
                    int lee = int.Parse(line[3]);

                    ans += Math.Max(w * lww + e * lew, w * lwe + e * lee);
                }

                sw.WriteLine($"Data Set {i}:");
                sw.WriteLine(ans);
                sw.WriteLine();
            }

            sw.Flush();
            sw.Close();
            sr.Close();
        }
    }
}
