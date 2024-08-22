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
            int t = int.Parse(line);
            
            for (int i = 0; i < t; i++)
            {
                string[] nm = sr.ReadLine().Split();
                int n = int.Parse(nm[0]);
                int m = int.Parse(nm[1]);

                HashSet<int> bottoms = new HashSet<int>(Array.ConvertAll(sr.ReadLine().Split(), int.Parse));
                HashSet<int> lefts = new HashSet<int>(Array.ConvertAll(sr.ReadLine().Split(), int.Parse));

                int collision = 0;

                foreach (var train in bottoms)
                {
                    if (lefts.Contains(train))
                        collision++;
                }

                sw.WriteLine(collision);
            }

            sw.Flush();
            sw.Close();
            sr.Close();
        }
    }
}
