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
            int n1 = int.Parse(sr.ReadLine());
            int n2 = int.Parse(sr.ReadLine());

            int diff = n2 - n1;
            if (diff <= -180)
                diff += 360;
            else if (diff > 180)
                diff -= 360;

            sw.WriteLine(diff);

            sw.Flush();
            sw.Close();
            sr.Close();
        }
    }
}
