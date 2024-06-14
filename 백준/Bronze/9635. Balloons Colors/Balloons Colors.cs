using System;
using System.IO;
using System.Text;

class Program
{
    static void Main(string[] args)
    {
        using (StreamReader sr = new StreamReader(Console.OpenStandardInput()))
        using (StreamWriter sw = new StreamWriter(Console.OpenStandardOutput()) { AutoFlush = false })
        {
            StringBuilder sb = new StringBuilder();

            int t = int.Parse(sr.ReadLine());

            for (int i = 0; i < t; i++)
            {
                string[] tokens = sr.ReadLine().Split();
                int n = int.Parse(tokens[0]);
                int x = int.Parse(tokens[1]);
                int y = int.Parse(tokens[2]);

                tokens = sr.ReadLine().Split();
                bool easyViolated = false, hardViolated = false;

                if (int.Parse(tokens[0]) == x)
                    easyViolated = true;
                if (int.Parse(tokens[n - 1]) == y)
                    hardViolated = true;

                if (easyViolated && hardViolated)
                    sb.AppendLine("BOTH");
                else if (easyViolated)
                    sb.AppendLine("EASY");
                else if (hardViolated)
                    sb.AppendLine("HARD");
                else
                    sb.AppendLine("OKAY");
            }

            sw.Write(sb);

            sw.Close();
            sr.Close();
        }
    }
}
