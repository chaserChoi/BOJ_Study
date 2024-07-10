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
            
            while (N-- > 0)
            {
                string[] line = sr.ReadLine().Split();
                int g = int.Parse(line[0]);
                int[] gnomes = new int[g];

                for (int j = 0; j < g; j++)
                    gnomes[j] = int.Parse(line[j + 1]);

                for (int i = 1; i < g - 1; i++)
                {
                    if (gnomes[i - 1] < gnomes[i] && gnomes[i] < gnomes[i + 1])
                        continue;
                    sw.WriteLine((gnomes[i - 1] < gnomes[i + 1]) ? i + 1 : i + 2);
                    break;
                }
            }

            sw.Flush();
            sw.Close();
            sr.Close();
        }
    }
}
