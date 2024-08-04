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
            string pwd1 = sr.ReadLine();
            string pwd2 = sr.ReadLine();

            int total = 1;

            for (int i = 0; i < 4; i++)
            {
                char d1 = pwd1[i];
                char d2 = pwd2[i];

                if (d1 == d2)
                    total *= 1;
                else
                    total *= 2;
            }

            sw.WriteLine(total);

            sw.Flush();
            sw.Close();
            sr.Close();
        }
    }
}
