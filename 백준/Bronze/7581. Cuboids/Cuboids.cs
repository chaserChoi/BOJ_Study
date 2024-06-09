using System;
using System.IO;

class Program
{
    static void Main(string[] args)
    {
        using (StreamReader sr = new StreamReader(Console.OpenStandardInput()))
        using (StreamWriter sw = new StreamWriter(Console.OpenStandardOutput()) { AutoFlush = false })
        {
            while (true)
            {
                string input = sr.ReadLine();
                if (input == "0 0 0 0") 
                    break; 

                string[] parts = input.Split(' ');
                int l = int.Parse(parts[0]);
                int w = int.Parse(parts[1]);
                int h = int.Parse(parts[2]);
                int v = int.Parse(parts[3]);

                if (l == 0) l = v / (w * h); 
                else if (w == 0) w = v / (l * h); 
                else if (h == 0) h = v / (l * w); 
                else v = l * w * h; 

                sw.WriteLine($"{l} {w} {h} {v}");
            }
            
            sr.Close();
            sw.Close();
        }
    }
}