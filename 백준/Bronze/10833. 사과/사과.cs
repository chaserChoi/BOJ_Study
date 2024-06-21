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
            int n = int.Parse(sr.ReadLine());
            int total = 0;

            for (int i = 0; i < n; i++)
            {
                string[] input = sr.ReadLine().Split();
                int students = int.Parse(input[0]);
                int apples = int.Parse(input[1]);
                int left = apples % students;
                total += left;
            }

            sw.WriteLine(total);

            sw.Flush();
            sw.Close();
            sr.Close();
        }
    }
}
