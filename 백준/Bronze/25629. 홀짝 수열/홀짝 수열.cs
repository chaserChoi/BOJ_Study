using System;
using System.IO;
using System.Text;

class Program
{
    static void Main(string[] args)
    {
        using (var sr = new StreamReader(Console.OpenStandardInput()))
        using (var sw = new StreamWriter(Console.OpenStandardOutput()) { AutoFlush = true })
        {
            int n = int.Parse(sr.ReadLine());

            int[] a = sr.ReadLine().Split().Select(int.Parse).ToArray();

            int odd = 0, even = 0;

            foreach (int x in a)
            {
                if (x % 2 == 1)
                    odd++;
                else
                    even++;
            }

            sw.WriteLine(odd - even == 0 || odd - even == 1 ? 1 : 0);

            sw.Flush();
            sw.Close();
            sr.Close();
        }
    }
}
