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

            for (int i = 0; i < T; i++)
            {
                string[] input = sr.ReadLine().Split();
                int sum = 0;

                foreach (string s in input)
                    sum += int.Parse(s);

                sw.WriteLine(sum);
            }

            sw.Flush();
            sw.Close();
            sr.Close();
        }
    }
}
