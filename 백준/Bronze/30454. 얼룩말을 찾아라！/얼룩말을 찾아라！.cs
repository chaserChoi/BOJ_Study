using System;
using System.Globalization;
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
            int n = int.Parse(line[0]);
            int l = int.Parse(line[1]);

            int max = 0;
            int cnt = 0;

            for (int i = 0; i < n; i++)
            {
                string zebra = sr.ReadLine();
                int stripes = CntStripes(zebra);

                if (stripes > max)
                {
                    max = stripes;
                    cnt = 1;
                } else if (stripes == max)
                    cnt++;
            }

            sw.WriteLine($"{max} {cnt}");

            sw.Flush();
            sw.Close();
            sr.Close();
        }
    }

    static int CntStripes(string zebra)
    {
        int cnt = 0;
        bool isStripe = false;

        foreach (char c in zebra)
        {
            if (c == '1')
            {
                if (!isStripe)
                {
                    cnt++;
                    isStripe = true;
                }
            } else
                isStripe = false;
        }

        return cnt;
    }
}
