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
            int n = int.Parse(sr.ReadLine());
            string S = sr.ReadLine();

            bool[] awake = new bool[n];

            for (int i = 0; i < n; i++)
            {
                if (S[i] == '0')
                    continue;

                awake[i] = true;
                if (i + 1 < n)
                    awake[i + 1] = true;
                if (i + 2 < n)
                    awake[i + 2] = true;
            }

            int awakeCnt = awake.Count(x => x);

            sw.WriteLine(awakeCnt);

            sw.Flush();
            sw.Close();
            sr.Close();
        }
    }
}
