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
            int k = int.Parse(sr.ReadLine());

            string[] original = new string[]
            {
                "G...",
                ".I.T",
                "..S."
            };

            StringBuilder sb = new StringBuilder();

            foreach (string line in original)
            {
                for (int i = 0; i < k; i++)
                {
                    foreach (char c in line)
                        sb.Append(c, k);
                    sb.AppendLine();
                }
            }

            sw.Write(sb.ToString());

            sw.Flush();
            sw.Close();
            sr.Close();
        }
    }
}
