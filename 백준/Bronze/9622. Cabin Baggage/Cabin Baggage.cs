using System;
using System.IO;
using System.Text;

class Program
{
    static void Main(string[] args)
    {
        using (StreamReader sr = new StreamReader(Console.OpenStandardInput()))
        using (StreamWriter sw = new StreamWriter(Console.OpenStandardOutput()) { AutoFlush = false })
        {
            StringBuilder sb = new StringBuilder();

            var t = int.Parse(sr.ReadLine()!);

            int cntAllowance = 0;
            for (int c = 0; c < t; c++)
            {
                var input = sr.ReadLine()!.Replace("  ", " ").Split(' ');
                var length = double.Parse(input[0]);
                var width = double.Parse(input[1]);
                var depth = double.Parse(input[2]);
                var weight = double.Parse(input[3]);

                var isAllowedSize = ((length <= 56 && width <= 45 && depth <= 25) || (length + width + depth <= 125));
                var isAllowedWeight = weight <= 7;

                if (isAllowedSize && isAllowedWeight)
                {
                    sw.WriteLine("1");
                    cntAllowance++;
                }
                else sw.WriteLine("0");
            }

            sw.WriteLine(cntAllowance);

            sw.Close();
            sr.Close();
        }
    }
}
