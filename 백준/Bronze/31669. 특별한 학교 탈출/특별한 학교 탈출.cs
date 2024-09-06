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
            string[] firLine = sr.ReadLine().Split();
            int n = int.Parse(firLine[0]);
            int m = int.Parse(firLine[1]);

            char[,] schedule = new char[n, m];
            for (int i = 0; i < n; i++)
            {
                string line = sr.ReadLine();
                for (int j = 0; j < m; j++)
                    schedule[i, j] = line[j];
            }

            for (int i = 0; i < m; i++)
            {
                bool canEscape = true;
                for (int j = 0; j < n; j++)
                {
                    if (schedule[j, i] == 'O')
                    {
                        canEscape = false;
                        break;
                    }
                }

                if (canEscape)
                {
                    sw.WriteLine(i + 1);
                    return;
                }
            }

            sw.WriteLine("ESCAPE FAILED");

            sw.Flush();
            sw.Close();
            sr.Close();
        }
    }
}
