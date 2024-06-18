using System;
using System.IO;

class Program
{
    static void Main(string[] args)
    {
        using (TextReader sr = new StreamReader(Console.OpenStandardInput()))
        using (TextWriter sw = new StreamWriter(Console.OpenStandardOutput()) { AutoFlush = false })
        {
            Console.SetIn(sr);
            Console.SetOut(sw);

            int V = int.Parse(sr.ReadLine());
            string votes = Console.ReadLine();

            int A = 0, B = 0;
            foreach (char vote in votes)
            {
                if (vote == 'A')
                    A++;
                else
                    B++;
            }

            if (A > B)
                sw.WriteLine("A");
            else if (A < B)
                sw.WriteLine("B");
            else 
                sw.WriteLine("Tie");

            sw.Close();
            sr.Close();
        }
    }
}
