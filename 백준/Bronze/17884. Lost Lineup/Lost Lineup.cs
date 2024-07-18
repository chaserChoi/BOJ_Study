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
            int n = int.Parse(sr.ReadLine());
            var v = new List<(int, int)>();

            string[] line = sr.ReadLine().Split();
            for (int i = 0; i < n - 1; i++)
                v.Add((int.Parse(line[i]) , i));

            v.Sort((a, b) => a.Item1.CompareTo(b.Item1));

            sw.Write("1");
            for (int i = 0; i < n - 1; i++)
                sw.Write(" " + (v[i].Item2 + 2));
            sw.WriteLine();

            sw.Flush();
            sw.Close();
            sr.Close();
        }
    }
}
