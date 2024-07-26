using System;
using System.Globalization;
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
            int troom = int.Parse(line[0]);
            int tcond = int.Parse(line[1]);
            string mode = sr.ReadLine();

            int ans;

            switch (mode)
            {
                case "freeze":
                    ans = troom > tcond ? tcond : troom;
                    break;
                case "heat":
                    ans = troom < tcond ? tcond : troom;
                    break;
                case "auto":
                    ans = tcond;
                    break;
                case "fan":
                    ans = troom;
                    break;
                default:
                    throw new ArgumentException("Invalid mode");
            }

            sw.WriteLine(ans);

            sw.Flush();
            sw.Close();
            sr.Close();
        }
    }
}
