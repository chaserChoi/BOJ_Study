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

            for (int i = 0; n > 0; i++)
            {
                if ((n & 1) == 1)
                    sw.Write(i + " ");
                n >>= 1;
            }

            sw.Flush();
            sw.Close();
            sr.Close();
        }
    }
}
