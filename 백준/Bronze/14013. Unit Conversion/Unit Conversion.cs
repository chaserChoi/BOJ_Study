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
            double x = double.Parse(line[0]);
            double y = double.Parse(line[1]);

            int N = int.Parse(sr.ReadLine());

            for (int i = 0; i < N; i++)
            {
                line = sr.ReadLine().Split();
                double z = double.Parse(line[0]);
                char q = line[1][0];

                if (q == 'A')
                    sw.WriteLine(Math.Round(z * y / x, 15));
                else
                    sw.WriteLine(Math.Round(z * x / y, 15));
            }

            sw.Flush();
            sw.Close();
            sr.Close();
        }
    }
}
