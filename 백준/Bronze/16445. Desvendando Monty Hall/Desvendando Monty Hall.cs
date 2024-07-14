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
            int n = int.Parse(sr.ReadLine());
            int win = 0;

            while (n-- > 0)
            {
                int car = int.Parse(sr.ReadLine());

                if (car != 1)
                    win++;
            }

            sw.WriteLine(win);

            sw.Flush();
            sw.Close();
            sr.Close();
        }
    }
}
