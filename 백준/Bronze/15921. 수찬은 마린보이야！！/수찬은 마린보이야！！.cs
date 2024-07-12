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
            int N = int.Parse(sr.ReadLine());
            if (N == 0)
            {
                sw.WriteLine("divide by zero");
                return;
            }

            string[] line = sr.ReadLine().Split();
            double[] records = new double[N];
            double sum = 0;
            for (int i = 0; i < N; i++)
            {
                records[i] = double.Parse(line[i]);
                sum += records[i];
            }

            double avg = sum / N;
            double expectedVal = 0;
            for (int i = 0; i < N; i++)
                expectedVal += records[i] * (1.0 / N);

            if (expectedVal == 0)
            {
                sw.WriteLine("divide by zero");
                return;
            }

            double prob = avg / expectedVal;
            sw.WriteLine("{0:F2}", prob);

            sw.Flush();
            sw.Close();
            sr.Close();
        }
    }
}
