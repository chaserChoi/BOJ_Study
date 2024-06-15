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
            int N = int.Parse(sr.ReadLine());

            for (int i = 0; i < N; i++)
            {
                long id = long.Parse(sr.ReadLine());
                long val = (id % 1000) * 10;
                while (id != 0)
                {
                    val += id % 10;
                    id /= 10;
                }

                if (val > 9999)
                    val %= 10000;
                else if (val < 1000)
                    val += 1000;

                if (val < 1000) sw.Write(0);
                if (val < 100) sw.Write(0);
                if (val < 10) sw.Write(0);
                sw.WriteLine(val);
            }

            sw.Close();
            sr.Close();
        }
    }
}
