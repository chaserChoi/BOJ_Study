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
            string[] line = sr.ReadLine().Split();
            double total = 0;

            foreach (string note in line)
            {
                int noteLen = int.Parse(note);
                total += (noteLen != 0 ? 1.0 / noteLen : 2);
            }

            sw.WriteLine(total.ToString("F6"));

            sw.Flush();
            sw.Close();
            sr.Close();
        }
    }
}
