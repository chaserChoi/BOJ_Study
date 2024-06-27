using System;
using System.IO;
using System.Text;

class Program
{
    static void Main(string[] args) 
    {
        using (TextReader sr = new StreamReader(Console.OpenStandardInput()))
        using (TextWriter sw = new StreamWriter(Console.OpenStandardOutput()) { AutoFlush = false })
        {
            string s;
            while ((s = sr.ReadLine()) != null)
                sw.WriteLine(s);

            sw.Flush();
            sr.Close();
            sw.Close();
        }
    }
}
