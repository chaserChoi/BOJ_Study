using System;
using System.IO;

class Program
{
    static void Main(string[] args)
    {
        using (var sr = new StreamReader(Console.OpenStandardInput()))
        using (var sw = new StreamWriter(Console.OpenStandardOutput()) { AutoFlush = true } )
        {
            string coldestCity = "";
            int coldestTemp = 201;

            string line;
            while ((line = sr.ReadLine()) != null)
            {
                string[] parts = line.Split(' ');
                string city = parts[0];
                int temp = int.Parse(parts[1]);

                if (temp < coldestTemp) 
                {
                    coldestCity = city;
                    coldestTemp = temp;
                }

                if (city == "Waterloo") 
                    break;
            }

            sw.WriteLine(coldestCity);
            sw.Flush();
        }
    }
}
