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
            int tiger = 0;
            int lion = 0;

            for (int i = 0; i < 9; i++)
            {
                string vote = sr.ReadLine();
                if (vote == "Tiger")
                    tiger++;
                else
                    lion++;
            }

            if (tiger > lion && tiger >= 5)
                sw.WriteLine("Tiger");
            else if (tiger < lion && lion >= 5)
                sw.WriteLine("Lion");


            sw.Flush();
            sw.Close();
            sr.Close();
        }
    }
}
