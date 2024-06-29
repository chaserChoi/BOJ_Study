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
            while (true)
            {
                string[] input = sr.ReadLine().Split();
                int n = int.Parse(input[0]);
                int m = int.Parse(input[1]);
                int k = int.Parse(input[2]);

                if (n == 0 && m == 0 && k == 0)
                    break;

                int need = (n / 2) + 1;
                
                if (need <= m) 
                {
                    sw.WriteLine(0);
                    continue;
                }
                    

                if (need - m > n - m - k)
                    sw.WriteLine(-1);
                else 
                    sw.WriteLine(need - m);
            }

            sw.Flush();
            sw.Close();
            sr.Close();
        }
    }
}
