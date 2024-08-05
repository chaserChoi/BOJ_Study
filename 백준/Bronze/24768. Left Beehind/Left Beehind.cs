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
            while (true)
            {
                string[] line = sr.ReadLine().Split();
                int sweet = int.Parse(line[0]);
                int sour = int.Parse(line[1]);

                if (sweet == 0 && sour == 0)
                    break;
                
                if (sweet + sour == 13)
                    sw.WriteLine("Never speak again.");
                else if (sweet < sour)
                    sw.WriteLine("Left beehind.");
                else if (sweet == sour)
                    sw.WriteLine("Undecided.");
                else
                    sw.WriteLine("To the convention.");
            }

            sw.Flush();
            sw.Close();
            sr.Close();
        }
    }
}
