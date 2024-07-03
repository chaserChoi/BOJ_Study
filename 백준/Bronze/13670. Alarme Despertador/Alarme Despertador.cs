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
            StringBuilder sb = new StringBuilder();
            while (true) 
            {
                string[] line = sr.ReadLine().Split();
                int h1 = int.Parse(line[0]);
                int m1 = int.Parse(line[1]);
                int h2 = int.Parse(line[2]);
                int m2 = int.Parse(line[3]);

                if (h1 == 0 && m1 == 0 && h2 == 0 && m2 == 0)
                    break;

                int curr = h1 * 60 + m1;
                int alarm = h2 * 60 + m2;
                int sleep = alarm - curr;
                if (sleep < 0)
                    sleep += 1440;

                sb.AppendLine(sleep.ToString());
            }

            sw.WriteLine(sb.ToString().TrimEnd());

            sw.Flush();
            sw.Close();
            sr.Close();
        }
    }
}
