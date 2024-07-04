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
            string s = sr.ReadLine();
            int p = 1, q = 4;
            foreach (char c in s)
            {
                switch (c)
                {
                    case 'A':
                        p = (p == 1 ? 2 : (p == 2 ? 1 : p));
                        q = (q == 1 ? 2 : (q == 2 ? 1 : q));
                        break;
                    case 'B':
                        p = (p == 1 ? 3 : (p == 3 ? 1 : p));
                        q = (q == 1 ? 3 : (q == 3 ? 1 : q));
                        break;
                    case 'C':
                        p = (p == 1 ? 4 : (p == 4 ? 1 : p));
                        q = (q == 1 ? 4 : (q == 4 ? 1 : q));
                        break;
                    case 'D':
                        p = (p == 2 ? 3 : (p == 3 ? 2 : p));
                        q = (q == 2 ? 3 : (q == 3 ? 2 : q));
                        break;
                    case 'E':
                        p = (p == 2 ? 4 : (p == 4 ? 2 : p));
                        q = (q == 2 ? 4 : (q == 4 ? 2 : q));
                        break;
                    case 'F':
                        p = (p == 3 ? 4 : (p == 4 ? 3 : p));
                        q = (q == 3 ? 4 : (q == 4 ? 3 : q));
                        break;
                }
            }

            sw.WriteLine(p);
            sw.WriteLine(q);

            sw.Flush();
            sw.Close();
            sr.Close();
        }
    }
}
