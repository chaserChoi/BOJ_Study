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
            string[] line = sr.ReadLine().Split();
            int l1 = int.Parse(line[0]);
            int r1 = int.Parse(line[1]);
            int l2 = int.Parse(line[2]);
            int r2 = int.Parse(line[3]);
            int k = int.Parse(line[4]);

            int start = Math.Max(l1, l2);
            int end = Math.Min(r1, r2);

            if (start > end)
            {
                sw.WriteLine(0);
                return;
            }

            if (start <= k && k <= end)
                sw.WriteLine(end - start);
            else
                sw.WriteLine(end - start + 1);

            sw.Flush();
            sw.Close();
            sr.Close();
        }
    }
}
