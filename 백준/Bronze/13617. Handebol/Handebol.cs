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
            string[] line = sr.ReadLine().Split();
            int N = int.Parse(line[0]);
            int M = int.Parse(line[1]);

            int cnt = 0;
            while (N-- > 0)
            {
                line = sr.ReadLine().Split();
                bool flag = true;
                for (int i = 0; i < M; i++)
                {
                    if (int.Parse(line[i]) == 0)
                    {
                        flag = false;
                        break;
                    }
                }
                if (flag)
                    cnt++;
            }

            sw.WriteLine(cnt);

            sw.Flush();
            sw.Close();
            sr.Close();
        }
    }
}
