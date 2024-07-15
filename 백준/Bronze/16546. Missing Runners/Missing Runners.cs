using System;
using System.IO;
using System.Text;

class Program
{
    static void Main(string[] args)
    {
        using (var sr = new StreamReader(Console.OpenStandardInput()))
        using (var sw = new StreamWriter(Console.OpenStandardOutput()))
        {
            int n = int.Parse(sr.ReadLine());
            bool[] runners = new bool[n + 1];

            string[] line = sr.ReadLine().Split();
            for (int i = 0; i < n - 1; i++)
            {
                int num = int.Parse(line[i]);
                runners[num] = true;
            }

            for (int i = 1; i <= n; i++)
            {
                if (!runners[i])
                {
                    sw.WriteLine(i);
                    break;
                }
            }

            sw.Flush();
            sw.Close();
            sr.Close();
        }
    }
}
