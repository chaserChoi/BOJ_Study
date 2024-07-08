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
            int k = int.Parse(line[0]);
            int d = int.Parse(line[1]);

            int books = 1;
            int days = k;
            while (days <= d)
            {
                books++;
                days += 2 * k;
                k *= 2;
            }

            sw.WriteLine(books - 1);

            sw.Flush();
            sw.Close();
            sr.Close();
        }
    }
}
