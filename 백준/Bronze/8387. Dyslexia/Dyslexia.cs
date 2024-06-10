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

            int correctCnt = 0;

            for (int i = 0; i < n; i++)
            {
                if (originalText[i] == rewrittenText[i])
                    correctCnt++;
            }

            sw.WriteLine(correctCnt);

            sr.Close();
            sw.Close();
        }
    }
}