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

            int n = int.Parse(sr.ReadLine());
            int[] q1 = new int[1], q2 = new int[1], q3 = new int[1], q4 = new int[1], axis = new int[1];

            for (int i = 0; i < n; i++)
            {
                string[] tokens = sr.ReadLine().Split();
                int x = int.Parse(tokens[0]);
                int y = int.Parse(tokens[1]);

                if (x > 0 && y > 0)
                    q1[0]++;
                else if (x < 0 && y > 0)
                    q2[0]++;
                else if (x < 0 && y < 0)
                    q3[0]++;
                else if (x > 0 && y < 0)
                    q4[0]++;
                else
                    axis[0]++;
            }

            sb.AppendLine($"Q1: {q1[0]}");
            sb.AppendLine($"Q2: {q2[0]}");
            sb.AppendLine($"Q3: {q3[0]}");
            sb.AppendLine($"Q4: {q4[0]}");
            sb.AppendLine($"AXIS: {axis[0]}");

            sw.Write(sb);

            sw.Close();
            sr.Close();
        }
    }
}
