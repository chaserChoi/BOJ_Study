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
            int Q = int.Parse(sr.ReadLine());

            for (int i = 0; i < Q; i++)
            {
                int a = int.Parse(sr.ReadLine());

                if ((a & (-a)) == a)
                    sw.WriteLine("1");
                else
                    sw.WriteLine("0");
            }

            sw.Flush();
            sw.Close();
            sr.Close();
        }
    }
}
