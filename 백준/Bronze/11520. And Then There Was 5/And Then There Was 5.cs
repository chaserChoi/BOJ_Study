using System;
using System.IO;
using System.Text;

class Program
{
    static void Main(string[] args) 
    {
        using (TextReader sr = new StreamReader(Console.OpenStandardInput()))
        using (TextWriter sw = new StreamWriter(Console.OpenStandardOutput()) { AutoFlush = false })
        {
            int T = int.Parse(sr.ReadLine());
            while (T-- > 0)
            {
                string[] input = sr.ReadLine().Split();
                int x = int.Parse(input[0]);
                int y = int.Parse(input[1]);
                sw.WriteLine($"{y} 5");
            }

            sw.Flush();
            sw.Close();
            sr.Close();
        }
    }
}
