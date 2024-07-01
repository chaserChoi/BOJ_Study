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
            StringBuilder sb = new StringBuilder();

            while (n != 1)
            {
                sb.Append(n + " ");

                if (n % 2 == 0)
                    n /= 2;
                else 
                    n = n * 3 + 1;
            }

            sb.Append("1");
            sw.WriteLine(sb.ToString());

            sw.Flush();
            sw.Close();
            sr.Close();
        }
    }
}
