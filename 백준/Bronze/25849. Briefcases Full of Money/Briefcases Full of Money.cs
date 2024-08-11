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
            string[] line = sr.ReadLine().Split();
            int[] cnts = Array.ConvertAll(line, int.Parse);

            int[] denos = { 1, 5, 10, 20, 50, 100 };

            int max = 0;
            int min = int.MaxValue;
            int chosen = 0;

            for (int i = 0; i < 6; i++)
            {
                int curAmount = cnts[i] * denos[i];
                int curBills = cnts[i];

                if (curAmount > max || (curAmount == max && curBills < min))
                {
                    max = curAmount;
                    min = curBills;
                    chosen = denos[i];
                }
            }

            sw.WriteLine(chosen);

            sw.Flush();
            sw.Close();
            sr.Close();
        }
    }
}
