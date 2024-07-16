using System;
using System.IO;

class Program
{
    static void Main(string[] args)
    {
        using (var sr = new StreamReader(Console.OpenStandardInput()))
        using (var sw = new StreamWriter(Console.OpenStandardOutput()) { AutoFlush = true } )
        {
            string[] line = sr.ReadLine().Split();
            int total = 5000;
            foreach (string b in line)
            {
                switch (int.Parse(b))
                {
                    case 1: 
                        total -= 500;
                        break;
                    case 2:
                        total -= 800;
                        break;
                    case 3:
                        total -= 1000;
                        break;
                }
            }

            sw.WriteLine(total);

            sw.Flush();
            sw.Close();
            sr.Close();
        }
    }
}
