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
            var line1 = sr.ReadLine().Split();
            var br = int.Parse(line1[0]);
            var bc = int.Parse(line1[1]);

            var line2 = sr.ReadLine().Split();
            var dr = int.Parse(line2[0]);
            var dc = int.Parse(line2[1]);

            var line3 = sr.ReadLine().Split();
            var jr = int.Parse(line3[0]);
            var jc = int.Parse(line3[1]);

            var bessie = Math.Max(Math.Abs(jr - br), Math.Abs(jc - bc));
            var daisy = Math.Abs(jr - dr) + Math.Abs(jc - dc);

            sw.WriteLine(bessie < daisy ? "bessie" : (bessie > daisy ? "daisy" : "tie"));

            sw.Flush();
            sw.Close();
            sr.Close();
        }
    }
}
