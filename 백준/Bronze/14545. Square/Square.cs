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
            int P = int.Parse(sr.ReadLine());
            
            while (P-- > 0)
            {
                double l = double.Parse(sr.ReadLine());

                sw.WriteLine(l * (l + 1) * (2 * l + 1) / 6);
            }

            sw.Flush();
            sw.Close();
            sr.Close();
        }
    }
}
