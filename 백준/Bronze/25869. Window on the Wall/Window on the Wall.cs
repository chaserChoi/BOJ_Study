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
            int w = int.Parse(line[0]);
            int h = int.Parse(line[1]);
            int d = int.Parse(line[2]);

            int effW = w - 2 * d;
            int effH = h - 2 * d;

            if (effW <= 0 || effH <= 0)
                sw.WriteLine(0);
            else
            {
                int max = effW * effH;
                sw.WriteLine(max);
            }

            sw.Flush();
            sw.Close();
            sr.Close();
        }
    }
}
