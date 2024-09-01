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
            var input = sr.ReadLine().Trim().Split(new char[] { ' ', ':' });
            int h = int.Parse(input[0]);
            int m = int.Parse(input[1]);
            int remain = int.Parse(sr.ReadLine().Trim());

            int nextH;
            int nextM;

            if (m == 0)
                remain -= h;
            else if (m % 15 == 0)
                remain -= 1;

            while (remain > 0)
            {
                (nextH, nextM) = GetNext(h, m);
                h = nextH;
                m = nextM;

                if (m == 0)
                    remain -= h;
                else
                    remain -= 1;
            }

            sw.WriteLine($"{h:D2}:{m:D2}");

            sw.Flush();
            sw.Close();
            sr.Close();
        }
    }

    static (int, int) GetNext(int hour, int minute)
    {
        if (minute < 15) 
            return (hour, 15);
        if (minute < 30) 
            return (hour, 30);
        if (minute < 45) 
            return (hour, 45);
            
        return (hour % 12 + 1, 0);
    }
}
