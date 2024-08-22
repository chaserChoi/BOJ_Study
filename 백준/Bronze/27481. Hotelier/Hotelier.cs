using System;
using System.Globalization;
using System.IO;
using System.Text;

class Program
{
    static void Main(string[] args)
    {
        using (var sr = new StreamReader(Console.OpenStandardInput()))
        using (var sw = new StreamWriter(Console.OpenStandardOutput()) { AutoFlush = true })
        {
            var line = sr.ReadLine();
            int n = int.Parse(line);
            string events = sr.ReadLine();

            int[] rooms = new int[10];

            foreach (char a in events)
            {
                if (a == 'L')
                {
                    for (int i = 0; i < 10; i++)
                    {
                        if (rooms[i] == 0)
                        {
                            rooms[i] = 1;
                            break;
                        }
                    }
                }
                else if (a == 'R')
                {
                    for (int i = 9; i >= 0; i--)
                    {
                        if (rooms[i] == 0)
                        {
                            rooms[i] = 1;
                            break;
                        }
                    }
                }
                else
                {
                    int num = a - '0';
                    rooms[num] = 0;
                }
            }

            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < 10; i++)
                sb.Append(rooms[i]);

            sw.WriteLine(sb.ToString());

            sw.Flush();
            sw.Close();
            sr.Close();
        }
    }
}
