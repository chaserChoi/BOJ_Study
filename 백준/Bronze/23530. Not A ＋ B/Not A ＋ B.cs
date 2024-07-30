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
            int t = int.Parse(sr.ReadLine());

            while (t-- > 0)
            {
                string[] line = sr.ReadLine().Split();
                int a = int.Parse(line[0]);
                int b = int.Parse(line[1]);

                sw.WriteLine(1);
            }

            sw.Flush();
            sw.Close();
            sr.Close();
        }
    }
}
