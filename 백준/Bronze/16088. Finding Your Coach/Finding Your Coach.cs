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
            int T = int.Parse(sr.ReadLine());

            while (T-- > 0)
            {
                string[] line = sr.ReadLine().Split();
                int l = int.Parse(line[0]);
                int r = int.Parse(line[1]);
                int n = int.Parse(line[2]);
                int m = int.Parse(line[3]);
                
                if (n == m) 
                {
                    sw.WriteLine('G');
                    continue;
                }
                if (Math.Abs(n - m) <= l && Math.Abs(n - m) <= r)
                {
                    sw.WriteLine('E');
                    continue;
                }
                if (Math.Abs(n - m) <= l)
                {
                    sw.WriteLine('L');
                    continue;
                }
                if (Math.Abs(n - m) <= r);
                {
                    sw.WriteLine('R');
                    continue;
                }
                sw.WriteLine('E');
            }

            sw.Flush();
            sw.Close();
            sr.Close();
        }
    }
}
