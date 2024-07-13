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
            int K = int.Parse(sr.ReadLine());
            int N = int.Parse(sr.ReadLine());

            for (int i = 1; i < N; i++)
            {
                sw.WriteLine(i);
                K -= i;
            }

            sw.WriteLine(K);

            sw.Flush();
            sw.Close();
            sr.Close();
        }
    }
}
