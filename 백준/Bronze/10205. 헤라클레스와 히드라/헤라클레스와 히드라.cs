using System;
using System.IO;

class Program
{
    static void Main(string[] args)
    {
        using (TextReader sr = new StreamReader(Console.OpenStandardInput()))
        using (TextWriter sw = new StreamWriter(Console.OpenStandardOutput()) { AutoFlush = false })
        {
            int K = int.Parse(sr.ReadLine());

            for (int i = 1; i <= K; i++)
            {
                int h = int.Parse(sr.ReadLine());
                string actions = sr.ReadLine();

                foreach (char act in actions)
                {
                    if (act == 'c')
                        h++;
                    else 
                        h--;
                }

                sw.WriteLine("Data Set " + i + ":\n" + h + "\n");
            }

            sw.Flush();
            sw.Close();
            sr.Close();
        }
    }
}
