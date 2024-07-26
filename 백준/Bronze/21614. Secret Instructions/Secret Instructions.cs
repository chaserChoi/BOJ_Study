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
            string prev = "";
            string line;

            while ((line = sr.ReadLine()) != "99999")
            {
                int first = line[0] - '0';
                int second = line[1] - '0';
                int steps = int.Parse(line.Substring(2));

                string cur;

                int sum = first + second;

                if (sum == 0)
                    cur = prev;
                else if (sum % 2 == 1)
                    cur = "left";
                else 
                    cur = "right";

                prev = cur;

                sw.WriteLine($"{cur} {steps}");
            }

            sw.Flush();
            sw.Close();
            sr.Close();
        }
    }
}
