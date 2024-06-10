using System;
using System.IO;

class Program
{
    static void Main(string[] args)
    {
        using (StreamReader sr = new StreamReader(Console.OpenStandardInput()))
        using (StreamWriter sw = new StreamWriter(Console.OpenStandardOutput()) { AutoFlush = false })
        {
            int n = int.Parse(sr.ReadLine());
            string originalText = sr.ReadLine(); 
            string rewrittenText = sr.ReadLine(); 

            int mistakeCnt = 0;

            for (int i = 0; i < n; i++)
            {
                if (originalText[i] != rewrittenText[i])
                    mistakeCnt++;
            }

            sw.WriteLine(mistakeCnt);

            sr.Close();
            sw.Close();
        }
    }
}