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
            for (int i = 0; i < T; i++) 
            {
                string[] input = sr.ReadLine().Split();
                int x1 = int.Parse(input[0]);
                int y1 = int.Parse(input[1]);
                int f1 = int.Parse(input[2]);
                int x2 = int.Parse(input[3]);
                int y2 = int.Parse(input[4]);
                int f2 = int.Parse(input[5]);

                int dist = Math.Abs(x1 - x2) + Math.Abs(y1 - y2) + f1 + f2;

                sw.WriteLine(dist);
            }

            sw.Flush();
            sw.Close();
            sr.Close();
        }
    }
}
