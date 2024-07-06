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
            string[] starts = sr.ReadLine().Split();
            int startX = int.Parse(starts[0]);
            int startY = int.Parse(starts[1]);

            string[] dests = sr.ReadLine().Split();
            int destX = int.Parse(dests[0]);
            int destY = int.Parse(dests[1]);

            int battery = int.Parse(sr.ReadLine());

            int diff = battery - Math.Abs(startX - destX) - Math.Abs(startY - destY);
            sw.WriteLine(diff >= 0 && (diff & 1) == 0 ? "Y" : "N");

            sw.Flush();
            sw.Close();
            sr.Close();
        }
    }
}
