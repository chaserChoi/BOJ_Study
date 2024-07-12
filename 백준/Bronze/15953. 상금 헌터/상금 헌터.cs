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
            int T = int.Parse(sr.ReadLine());

            while (T-- > 0)
            {
                string[] input = sr.ReadLine().Split();
                int a = int.Parse(input[0]);
                int b = int.Parse(input[1]);

                int prize = 0;
                if (a == 0) ;
                else if (a == 1) prize += 5000000;
                else if (a <= 3) prize += 3000000;
                else if (a <= 6) prize += 2000000;
                else if (a <= 10) prize += 500000;
                else if (a <= 15) prize += 300000;
                else if (a <= 21) prize += 100000;

                if (b == 0) ;
                else if (b == 1) prize += 5120000;
                else if (b <= 3) prize += 2560000;
                else if (b <= 7) prize += 1280000;
                else if (b <= 15) prize += 640000;
                else if (b <= 31) prize += 320000;

                sw.WriteLine(prize);
            }

            sw.Flush();
            sw.Close();
            sr.Close();
        }
    }
}
