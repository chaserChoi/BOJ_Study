using System;
using System.IO;

class Program
{
    static void Main(string[] args)
    {
        using (TextReader sr = new StreamReader(Console.OpenStandardInput()))
        using (TextWriter sw = new StreamWriter(Console.OpenStandardOutput()) { AutoFlush = false })
        {
            int[] con1 = new int[5];
            int[] con2 = new int[5];
            string[] line1 = sr.ReadLine().Split();
            string[] line2 = sr.ReadLine().Split();

            for (int i = 0; i < 5; i++)
            {
                con1[i] = int.Parse(line1[i]);
                con2[i] = int.Parse(line2[i]);
            }

            bool areCompatible = true;
            for (int i = 0; i < 5; i++)
            {
                if ((con1[i] + con2[i]) != 1)
                {
                    areCompatible = false;
                    break;
                }
            }

            sw.WriteLine(areCompatible ? "Y" : "N");

            sw.Flush();
            sw.Close();
            sr.Close();
        }
    }
}
