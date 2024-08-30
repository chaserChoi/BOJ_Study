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
            int d = int.Parse(line[0]);
            int a = int.Parse(line[1]);
            int k = int.Parse(line[2]);

            bool found = false;

            for (int i = 1; i < 1000; i++)
            {
                for (int j = 1; j < 1000; j++)
                {
                    if ((i * a) + (j * k) == d)
                    {
                        found = true;
                        break;
                    }
                }
                if (found)
                    break;
            }

            sw.WriteLine(found ? 1 : 0);

            sw.Flush();
            sw.Close();
            sr.Close();
        }
    }
}
