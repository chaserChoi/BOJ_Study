using System;
using System.IO;
using System.Text;

class Program
{
    static void Main(string[] args) 
    {
        using (TextReader sr = new StreamReader(Console.OpenStandardInput()))
        using (TextWriter sw = new StreamWriter(Console.OpenStandardOutput()) { AutoFlush = false })
        {
            List<(string, int)> v = new List<(string, int)>(6);
            for (int i = 0; i < 6; i++)
            {
                string[] input = sr.ReadLine().Split();
                v.Add((input[0], int.Parse(input[1])));
            }

            string s = sr.ReadLine();
            while (s != "-1") 
            {
                int ret = 0;
                if (v[0].Item1 == s) ret += v[0].Item2;
                if (v[1].Item1 == s.Substring(0, 3)) ret += v[1].Item2;
                if (v[2].Item1 == s.Substring(0, 3)) ret += v[2].Item2;
                if (v[3].Item1 == s.Substring(3, 3)) ret += v[3].Item2;
                if (v[4].Item1 == s.Substring(3, 3)) ret += v[4].Item2;
                if (v[5].Item1 == s.Substring(4, 2)) ret += v[5].Item2;
                sw.WriteLine(ret);
                s = sr.ReadLine(); 
            }

            sw.Flush();
            sw.Close();
            sr.Close();
        }
    }
}
