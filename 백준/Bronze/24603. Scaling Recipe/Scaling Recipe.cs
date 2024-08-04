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
            string[] line = sr.ReadLine().Split();
            int n = int.Parse(line[0]);
            int x = int.Parse(line[1]);
            int y = int.Parse(line[2]);

            for (int i = 0; i < n; i++)
            {
                int a = int.Parse(sr.ReadLine());
                
                sw.WriteLine(a * y / x);
            }

            sw.Flush();
            sw.Close();
            sr.Close();
        }
    }
}
