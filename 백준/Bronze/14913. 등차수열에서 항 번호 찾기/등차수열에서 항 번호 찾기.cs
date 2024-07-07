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
            int d = int.Parse(line[1]);
            int k = int.Parse(line[2]);

            if ((k - a) % d != 0) 
                sw.WriteLine("X");
            else if ((k - a) / d < 0)
                sw.WriteLine("X");
            else
                sw.WriteLine((k - a) / d + 1);


            sw.Flush();
            sw.Close();
            sr.Close();
        }
    }
}
