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
            
            const string v = "aeiou";

            for (int i = 0; i < n; i++)
            {
                string name = sr.ReadLine();
                int cnt = 0;
                int cons = 0;

                foreach (char c in name)
                {
                    if (v.Contains(c))
                        cnt++;
                    else 
                        cons++;
                }

                sw.WriteLine(name);
                sw.WriteLine(cnt > cons ? "1" : "0");
            }

            sw.Flush();
            sw.Close();
            sr.Close();
        }
    }
}
