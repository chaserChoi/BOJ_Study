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
            while (true)
            {
                string[] input = sr.ReadLine().Split();
                int C = int.Parse(input[0]);
                int W = int.Parse(input[1]);
                int L = int.Parse(input[2]);
                int P = int.Parse(input[3]);

                if (C == 0 && W == 0 && L == 0 && P == 0) break;

                double books = 0;
                books += Math.Pow(C, W * L * P);

                sw.WriteLine(books);
            }

            sw.Flush();
            sw.Close();
            sr.Close();
        }
    }
}
