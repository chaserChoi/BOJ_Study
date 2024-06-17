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
            var input = sr.ReadLine().Split();
            var n = int.Parse(input[0]);
            var k = int.Parse(input[1]);
            
            var timings = new List<int>();
            for (int i = 0; i < n; i++)
                timings.Add(int.Parse(sr.ReadLine()));

            int cnt = 0;
            for (int i = 1; i < n; i++)
            {
                if (timings[i - 1] - timings[i] >= k)
                    cnt++;
            }

            sw.WriteLine(cnt);

            sw.Close();
            sr.Close();
        }
    }
}
