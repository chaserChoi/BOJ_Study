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
            string line = sr.ReadLine();
            char[] keys = line.ToCharArray();

            Array.Sort(keys);

            string sort = new string(keys);

            if (sort == "123" || sort == "456" || sort == "789" || sort == "147" || 
                sort == "258" || sort == "369" || sort == "058")
                sw.WriteLine("Unlocked");
            else
                sw.WriteLine("Locked");

            sw.Flush();
            sw.Close();
            sr.Close();
        }
    }
}
