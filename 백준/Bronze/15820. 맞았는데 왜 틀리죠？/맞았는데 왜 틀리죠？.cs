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
            string[] line = sr.ReadLine().Split();
            int S1 = int.Parse(line[0]);
            int S2 = int.Parse(line[1]);

            bool allPass = true;
            bool samplePass = true;

            for (int i = 0; i < S1; i++)
            {
                line = sr.ReadLine().Split();
                int expected = int.Parse(line[0]);
                int actual = int.Parse(line[1]);
                if (expected != actual)
                {
                    samplePass = false;
                    allPass = false;
                }
            }

            for (int i = 0; i < S2; i++)
            {
                line = sr.ReadLine().Split();
                int expected = int.Parse(line[0]);
                int actual = int.Parse(line[1]);
                if (expected != actual)
                    allPass = false;
            }

            if (allPass)
                sw.WriteLine("Accepted");
            else if (!samplePass)
                sw.WriteLine("Wrong Answer");
            else
                sw.WriteLine("Why Wrong!!!");

            sw.Flush();
            sw.Close();
            sr.Close();
        }
    }
}
