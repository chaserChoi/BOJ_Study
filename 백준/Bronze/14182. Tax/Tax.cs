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
            while (true) 
            {
                int income = int.Parse(sr.ReadLine());
                if (income == 0) break;

                int tax = 0;
                if (income > 5000000)
                    tax = (int)(income * 0.2);
                else if (income > 1000000)
                    tax = (int)(income * 0.1);

                int net = income - tax;
                sw.WriteLine(net);
            }

            sw.Flush();
            sw.Close();
            sr.Close();
        }
    }
}
