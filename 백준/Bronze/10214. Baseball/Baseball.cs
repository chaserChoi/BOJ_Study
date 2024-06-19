using System;
using System.IO;

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
                int yonsei = 0, korea = 0;

                for (int j = 0; j < 9; j++)
                {
                    string[] scores = sr.ReadLine().Split();
                    yonsei += int.Parse(scores[0]);
                    korea += int.Parse(scores[1]);
                }

                if (yonsei > korea)
                    sw.WriteLine("Yonsei");
                else if (yonsei < korea)
                    sw.WriteLine("Korea");
                else
                    sw.WriteLine("Draw");
            }

            sw.Flush();
            sw.Close();
            sr.Close();
        }
    }
}
