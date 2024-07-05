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
            int a = int.Parse(line[0]);
            int b = int.Parse(line[1]);
            int c = int.Parse(line[2]);

            int[] len = { a, b, c };
            Array.Sort(len);

            if (len[0] + len[1] <= len[2])
                len[2] = len[0] + len[1] - 1;

            sw.WriteLine(len[0] + len[1] + len[2]);

            sw.Flush();
            sw.Close();
            sr.Close();
        }
    }
}
