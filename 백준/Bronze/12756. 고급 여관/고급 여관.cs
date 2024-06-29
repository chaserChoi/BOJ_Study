using System;
using System.IO;

class Program
{
    static void Main(string[] args)
    {
        using (var sr = new StreamReader(Console.OpenStandardInput()))
        using (var sw = new StreamWriter(Console.OpenStandardOutput()))
        {
            string[] input1 = sr.ReadLine().Split();
            int attack1 = int.Parse(input1[0]);
            int health1 = int.Parse(input1[1]);

            string[] input2 = sr.ReadLine().Split();
            int attack2 = int.Parse(input2[0]);
            int health2 = int.Parse(input2[1]);

            while (health1 > 0 && health2 > 0)
            {
                health1 -= attack2;
                health2 -= attack1;
            }

            if (health1 > 0 && health2 <= 0)
                sw.WriteLine("PLAYER A");
            else if (health1 <= 0 && health2 > 0)
                sw.WriteLine("PLAYER B");
            else
                sw.WriteLine("DRAW");

            sw.Flush();
            sw.Close();
            sr.Close();
        }
    }
}
