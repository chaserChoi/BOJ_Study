using System;
using System.Globalization;
using System.IO;
using System.Text;

class Program
{
    static void Main(string[] args)
    {
        using (var sr = new StreamReader(Console.OpenStandardInput()))
        using (var sw = new StreamWriter(Console.OpenStandardOutput()) { AutoFlush = true })
        {
            int num = int.Parse(sr.ReadLine());
            StringBuilder answerA = new StringBuilder();
            StringBuilder answerB = new StringBuilder();

            string[] inputA = sr.ReadLine().Split();
            for (int j = 0; j < num; j++)
                answerA.Append(inputA[j]);

            string[] inputB = sr.ReadLine().Split();
            for (int j = 0; j < num; j++)
                answerB.Append(inputB[j]);

            long A = long.Parse(answerA.ToString());
            long B = long.Parse(answerB.ToString());

            sw.WriteLine(Math.Min(A, B));

            sw.Flush();
            sw.Close();
            sr.Close();
        }
    }
}
