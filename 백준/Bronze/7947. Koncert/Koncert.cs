using System;
using System.IO;

class Program
{
    static void Main(string[] args)
    {
        using (StreamReader sr = new StreamReader(Console.OpenStandardInput()))
        using (StreamWriter sw = new StreamWriter(Console.OpenStandardOutput()) { AutoFlush = false })
        {
            int z = int.Parse(sr.ReadLine()); 

            for (int i = 0; i < z; i++)
            {
                int r = 0;
                int g = 0; 
                int b = 0;

                for (int j = 0; j < 10; j++)
                {
                    string[] colors = sr.ReadLine().Split(' ');
                    int _r = int.Parse(colors[0]);
                    int _g = int.Parse(colors[1]);
                    int _b = int.Parse(colors[2]);
                    r += _r;
                    g += _g;
                    b += _b;
                }

                sw.WriteLine($"{Avg(r)} {Avg(g)} {Avg(b)}");
            }

            sr.Close();
            sw.Close();
        }
    }

    static int Avg(int x)
    {
        return (x + 5) / 10;
    }
}