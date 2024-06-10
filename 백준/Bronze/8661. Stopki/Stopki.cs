using System;
using System.IO;

class Program
{
    static void Main(string[] args)
    {
        using (StreamReader sr = new StreamReader(Console.OpenStandardInput()))
        using (StreamWriter sw = new StreamWriter(Console.OpenStandardOutput()) { AutoFlush = false })
        {
            string[] inputs = sr.ReadLine().Split();
            int x = int.Parse(inputs[0]);
            int k = int.Parse(inputs[1]);
            int a = int.Parse(inputs[2]);

            if (x % (k + a) < k)
                sw.WriteLine(1);
            else
                sw.WriteLine(0);

            sr.Close();
            sw.Close();
        }
    }
}