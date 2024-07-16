using System;
using System.IO;

class Program
{
    static void Main(string[] args)
    {
        using (var sr = new StreamReader(Console.OpenStandardInput()))
        using (var sw = new StreamWriter(Console.OpenStandardOutput()) { AutoFlush = true } )
        {
            char init = char.Parse(sr.ReadLine());
            int N = int.Parse(sr.ReadLine());

            HashSet<char> owners = new HashSet<char>();
            owners.Add(init);
            
            while (N-- > 0)
            {
                string[] line = sr.ReadLine().Split();
                char w = line[0][0];
                char l = line[1][0];

                if (l != init)
                    continue;

                owners.Add(w);
                init = w;
            }

            sw.WriteLine(init);
            sw.WriteLine(owners.Count);

            sw.Flush();
            sw.Close();
            sr.Close();
        }
    }
}
