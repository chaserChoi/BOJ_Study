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
            string line;
            while ((line = sr.ReadLine()) != null)
            {
                int n = int.Parse(line);
                if (n == 0)
                    break;

                    string[] prices = sr.ReadLine().Split();
                    int total = 0;

                    foreach (string p in prices)
                    {
                        int curr = int.Parse(p);
                        if (total + curr <= 300)
                            total += curr;
                    }

                sw.WriteLine(total);
            }

            sw.Flush();
            sw.Close();
            sr.Close();
        }
    }
}
