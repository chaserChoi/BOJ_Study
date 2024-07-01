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
            int N = int.Parse(sr.ReadLine());
            for (int i = 0; i < N; i++)
            {
                string cost = sr.ReadLine();
                sw.WriteLine(cost.Length);
            }

            sw.Flush();
            sw.Close();
            sr.Close();
        }
    }
}
