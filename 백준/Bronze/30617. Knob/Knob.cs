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
            int t = int.Parse(sr.ReadLine());
            var l = new List<int>(t);
            var r = new List<int>(t);

            for (int i = 0; i < t; i++)
            {
                string[] line = sr.ReadLine().Split();
                l.Add(int.Parse(line[0]));
                r.Add(int.Parse(line[1]));
            }

            int ans = (l[0] != 0 && l[0] == r[0]) ? 1 : 0;

            for (int i = 1; i < t; i++)
            {
                if (l[i] != 0) 
                    ans += (l[i] == l[i - 1]) ? 1 : 0;
                if (r[i] != 0) 
                    ans += (r[i] == r[i - 1]) ? 1 : 0;
                if (l[i] != 0 && r[i] != 0) 
                    ans += (l[i] == r[i]) ? 1 : 0;
            }

            sw.WriteLine(ans);

            sw.Flush();
            sw.Close();
            sr.Close();
        }
    }
}
