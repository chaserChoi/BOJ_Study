using System;
using System.IO;
using System.Text;

class Program
{
    static void Main(string[] args)
    {
        using (var sr = new StreamReader(Console.OpenStandardInput()))
        using (var sw = new StreamWriter(Console.OpenStandardOutput()) { AutoFlush = true })
        {
            int n = int.Parse(sr.ReadLine());
            int cnt = 0;
            bool isGold = true;

            for (int i = 0; i < n; i++)
            {
                int p = int.Parse(sr.ReadLine());
                int f = int.Parse(sr.ReadLine());

                int start = p * 5 - f * 3;

                if (start > 40)
                    cnt++;
                else
                    isGold = false;
            }

            sw.Write(cnt);
            if (isGold)
                sw.Write("+");
            sw.WriteLine();

            sw.Flush();
            sw.Close();
            sr.Close();
        }
    }
}
