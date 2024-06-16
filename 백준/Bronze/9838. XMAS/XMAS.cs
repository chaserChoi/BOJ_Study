using System;
using System.ComponentModel;
using System.IO;
using System.Text;

class Program
{
    static void Main(string[] args)
    {
        using (TextReader sr = new StreamReader(Console.OpenStandardInput()))
        using (TextWriter sw = new StreamWriter(Console.OpenStandardOutput()) { AutoFlush = false })
        {
            int n = int.Parse(sr.ReadLine());
            int[] recipients = new int[n];
            for (int i = 0; i < n; i++) recipients[int.Parse(sr.ReadLine()) - 1] = i + 1;

            foreach (int recipient in recipients)
                sw.WriteLine(recipient);

            sw.Close();
            sr.Close();
        }
    }
}
