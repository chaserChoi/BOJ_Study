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
            string[] line = sr.ReadLine().Split();
            int g = int.Parse(line[0]);
            int s = int.Parse(line[1]);
            int c = int.Parse(line[2]);

            int bp = g * 3 + s * 2 + c * 1;

            string treasure = "";

            if (bp >= 8)
                sw.Write("Province or ");
            else if (bp >= 5)
                sw.Write("Duchy or ");
            else if (bp >= 2)
                sw.Write("Estate or ");
            
            if (bp >= 6)
                treasure = "Gold";
            else if (bp >= 3)
                treasure = "Silver";
            else
                treasure = "Copper";

            sw.WriteLine(treasure);

            sw.Flush();
            sw.Close();
            sr.Close();
        }
    }
}
