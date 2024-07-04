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
            int[,] v = new int[4, 4];
            for (int i = 0; i < 4; i++)
            {
                string[] line = sr.ReadLine().Split();
                for (int j = 0; j < 4; j++)
                    v[i, j] = int.Parse(line[j]);
            }

            int sum = v[0, 0] + v[0, 1] + v[0, 2] + v[0, 3];
            for (int i = 0; i < 4; i++)
            {
                if (v[i, 0] + v[i, 1] + v[i, 2] + v[i, 3] != sum)
                {
                    sw.WriteLine("not magic");
                    return;
                }
                if (v[0, i] + v[1, i] + v[2, i] + v[3, i] != sum)
                {
                    sw.WriteLine("not magic");
                    return;
                }
            }

            sw.WriteLine("magic");

            sw.Flush();
            sw.Close();
            sr.Close();
        }
    }
}
