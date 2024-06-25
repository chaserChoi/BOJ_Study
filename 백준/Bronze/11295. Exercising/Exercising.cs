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
            int user = 1;
            while (true)
            {
                int strideLen = int.Parse(sr.ReadLine());
                if (strideLen == 0)
                    break;
                
                int numEntries = int.Parse(sr.ReadLine());
                sw.WriteLine($"User {user}");

                for (int i = 0; i < numEntries; i++)
                {
                    int steps = int.Parse(sr.ReadLine());
                    double dist = (double)steps * strideLen / 100000;
                    sw.WriteLine(dist.ToString("F5"));
                }

                user++;
            }

            sw.Flush();
            sw.Close();
            sr.Close();
        }
    }
}
