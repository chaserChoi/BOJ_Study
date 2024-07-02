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
            string[] line = sr.ReadLine().Split();
            int fast = int.Parse(line[0]);
            int slow = int.Parse(line[1]);
            int lap = 1;

            while ((slow - fast) * lap < slow)
                lap++;

            sw.WriteLine(lap);

            sw.Flush();
            sw.Close();
            sr.Close();
        }
    }
}
