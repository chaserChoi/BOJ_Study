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
            string[] line = sr.ReadLine().Split();
            int p = int.Parse(line[0]);
            int q = int.Parse(line[1]);
            int s = int.Parse(line[2]);

            for (int t = 1; t <= s; t++)
            {
                if (t % p == 0 && t % q == 0)
                {
                    sw.WriteLine("yes");
                    return;
                }
            }

            sw.WriteLine("no");

            sw.Flush();
            sw.Close();
            sr.Close();
        }
    }
}
