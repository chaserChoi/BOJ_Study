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
            int[] weights = sr.ReadLine().Split().Select(int.Parse).ToArray();

            Array.Sort(weights);
            Array.Reverse(weights);

            int diff = 0;

            for (int i = 0; i < 4; i++)
                diff += (diff < 0 ? weights[i] : -weights[i]);

            sw.WriteLine(Math.Abs(diff));

            sw.Flush();
            sw.Close();
            sr.Close();
        }
    }
}
