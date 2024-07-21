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
            int t = int.Parse(sr.ReadLine());

            for (int i = 0; i < t; i++)
            {
                string code = sr.ReadLine();
                int ab = int.Parse(code.Substring(0, 2));
                int cd = int.Parse(code.Substring(2, 2));

                if ((ab * ab + cd * cd) % 7 == 1)
                    sw.WriteLine("YES");
                else
                    sw.WriteLine("NO");
            }

            sw.Flush();
            sw.Close();
            sr.Close();
        }
    }
}
