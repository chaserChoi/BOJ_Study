using System;
using System.IO;

class Program
{
    static void Main(string[] args)
    {
        using (var sr = new StreamReader(Console.OpenStandardInput()))
        using (var sw = new StreamWriter(Console.OpenStandardOutput()) { AutoFlush = true } )
        {
            int N = int.Parse(sr.ReadLine());
            int total = 0;

            for (int i = 0; i < N; i++) 
            {
                string cards = sr.ReadLine();
                int p = 0;

                for (int j = 0; j < 13; j++)
                {
                    switch (cards[j])
                    {
                        case 'A':
                            p += 4;
                            break;
                        case 'K':
                            p += 3;
                            break;
                        case 'Q':
                            p += 2;
                            break;
                        case 'J':
                            p += 1;
                            break;
                    }
                }

                total += p;
            }

            sw.WriteLine(total);

            sw.Flush();
            sw.Close();
            sr.Close();
        }
    }
}
