using System;
using System.IO;

class Program
{
    static void Main(string[] args)
    {
        using (StreamReader sr = new StreamReader(Console.OpenStandardInput()))
        using (StreamWriter sw = new StreamWriter(Console.OpenStandardOutput()) { AutoFlush = false })
        {
            int n = int.Parse(sr.ReadLine()); 
            string[] coords = sr.ReadLine().Split(' ');
            int b1 = int.Parse(coords[0]), b2 = int.Parse(coords[1]); 

            bool found = false;
            for (int i = 0; i < n; i++)
            {
                coords = sr.ReadLine().Split(' ');
                int lx = int.Parse(coords[0]);
                int ly = int.Parse(coords[1]); 
                int hx = int.Parse(coords[2]);
                int hy = int.Parse(coords[3]); 

                if (b1 >= lx && b1 <= hx && b2 >= ly && b2 <= hy)
                {
                    found = true;
                    break;
                }
            }

            sw.WriteLine(found ? "Yes" : "No");

            sr.Close();
            sw.Close();
        }
    }
}