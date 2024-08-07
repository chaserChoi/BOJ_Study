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
            int n = int.Parse(sr.ReadLine());

            int ocean = 0;
            int oxygen = 0;
            int temp = -30;

            for (int i = 0; i < n; i++)
            {
                string[] line = sr.ReadLine().Split();
                string par = line[0];
                int change = int.Parse(line[1].Substring(1));

                if (par == "ocean")
                    ocean += change;
                else if (par == "oxygen")
                    oxygen += change;
                else if (par == "temperature")
                    temp += change;
            }

            if (ocean >= 9 && oxygen >= 14 && temp >= 8)
                sw.WriteLine("liveable");
            else
                sw.WriteLine("not liveable");

            sw.Flush();
            sw.Close();
            sr.Close();
        }
    }
}
