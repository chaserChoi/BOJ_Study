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
            string[] line = sr.ReadLine().Split();
            int n = int.Parse(line[0]);
            int d = int.Parse(line[1]);

            List<string> grid = new List<string>();
            for (int i = 0; i < n; i++)
                grid.Add(sr.ReadLine());

            for (int i = 0; i < n; i++)
            {
                char[] row = grid[i].ToCharArray();
                for (int j = 0; j < n; j++)
                {
                    if (d == 1)
                        row[j] = FlipVertically(row[j]);
                    else
                        row[j] = FlipHorizontally(row[j]);
                }

                grid[i] = new string(row);
            }

            foreach (string row in grid)
                sw.WriteLine(row);

            sw.Flush();
            sw.Close();
            sr.Close();
        }
    }

    static char FlipVertically(char c)
    {
        switch (c)
        {
            case 'd': return 'q';
            case 'b': return 'p';
            case 'q': return 'd';
            case 'p': return 'b';
            default: return c; 
        }
    }

    static char FlipHorizontally(char c)
    {
        switch (c)
        {
            case 'd': return 'b';
            case 'b': return 'd';
            case 'q': return 'p';
            case 'p': return 'q';
            default: return c;
        }
    }
}
