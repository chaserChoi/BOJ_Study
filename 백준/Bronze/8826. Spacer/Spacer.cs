using System;
using System.IO;

class Program
{
    static void Main(string[] args)
    {
        using (StreamReader sr = new StreamReader(Console.OpenStandardInput()))
        using (StreamWriter sw = new StreamWriter(Console.OpenStandardOutput()) { AutoFlush = false })
        {
            int Z = int.Parse(sr.ReadLine());
            for (int i = 0; i < Z; i++)
            {
                int n = int.Parse(sr.ReadLine());
                string directions = sr.ReadLine();

                int x = 0;
                int y = 0;
                foreach (char dir in directions)
                {
                    switch (dir)
                    {
                        case 'N':
                            y++;
                            break;
                        case 'S':
                            y--;
                            break;
                        case 'W':
                            x--;
                            break;
                        case 'E':
                            x++;
                            break;
                    }
                }
                int time = Math.Abs(x) + Math.Abs(y);

                sw.WriteLine(time);
            }
        }
    }
}