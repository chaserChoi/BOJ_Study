using System;
using System.IO;
using System.Text;

class Program
{
    static void Main(string[] args)
    {
        using (var sr = new StreamReader(Console.OpenStandardInput()))
        using (var sw = new StreamWriter(Console.OpenStandardOutput()) { AutoFlush = true })
        {
            int n = int.Parse(sr.ReadLine());
            string ans = sr.ReadLine();

            int bigdata = 0;
            int security = 0;

            for (int i = 0; i < ans.Length;)
            {
                if (ans[i] == 'b')
                {
                    bigdata++; 
                    i += 7; 
                }
                else
                {
                    security++; 
                    i += 8; 
                }
            }

            if (bigdata > security)
                sw.WriteLine("bigdata?");
            else if (bigdata < security)
                sw.WriteLine("security!");
            else
                sw.WriteLine("bigdata? security!");

            sw.Flush();
            sw.Close();
            sr.Close();
        }
    }
}
