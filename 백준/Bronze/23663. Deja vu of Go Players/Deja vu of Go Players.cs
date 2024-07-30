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
                int n = int.Parse(line[0]);
                int m = int.Parse(line[1]);

                string[] red = sr.ReadLine().Split();
                string[] white = sr.ReadLine().Split();

                sw.WriteLine(n <= m ? "Yes" : "No");
            }

            sw.Flush();
            sw.Close();
            sr.Close();
        }
    }
}
