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
            char[] colors = new char[N];

            for (int i = 0; i < N; i++)
                colors[i] = char.Parse(sr.ReadLine());

            int aron = 2;
            for (int i = 1; i < N; i++)
            {
                if (colors[i] != colors[i - 1])
                    aron++;
            }

            sw.WriteLine(aron);

            sw.Flush();
            sw.Close();
            sr.Close();
        }
    }
}
