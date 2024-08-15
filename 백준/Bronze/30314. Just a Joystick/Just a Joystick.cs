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
            string prev = sr.ReadLine();
            string desired = sr.ReadLine();
            
            int total = 0;

            for (int i = 0; i < n; i++)
            {
                char p = prev[i];
                char d = desired[i];

                int dir = Math.Abs(p - d);
                int wrap = 26 - dir;

                total += Math.Min(dir, wrap);
            }

            sw.WriteLine(total);

            sw.Flush();
            sw.Close();
            sr.Close();
        }
    }
}
