using System;
using System.IO;

class Program
{
    static void Main(string[] args)
    {
        using (StreamReader sr = new StreamReader(Console.OpenStandardInput()))
        using (StreamWriter sw = new StreamWriter(Console.OpenStandardOutput()) { AutoFlush = false })
        {
            Console.SetOut(sw);

            int Z = int.Parse(sr.ReadLine());
            for (int i = 0; i < Z; i++)
            {
                string[] adamInput = sr.ReadLine().Split();
                double adamPaper = double.Parse(adamInput[0]);
                double adamRock = double.Parse(adamInput[1]);
                double adamScissors = double.Parse(adamInput[2]);

                string[] gosiaInput = sr.ReadLine().Split();
                double gosiaPaper = double.Parse(gosiaInput[0]);
                double gosiaRock = double.Parse(gosiaInput[1]);
                double gosiaScissors = double.Parse(gosiaInput[2]);

                double adamWinChance = adamPaper * gosiaRock + adamRock * gosiaScissors + adamScissors * gosiaPaper;
                double gosiaWinChance = gosiaPaper * adamRock + gosiaRock * adamScissors + gosiaScissors * adamPaper;

                if (adamWinChance > gosiaWinChance)
                    sw.WriteLine("ADAM");
                else if (adamWinChance < gosiaWinChance)
                    sw.WriteLine("GOSIA");
                else
                    sw.WriteLine("=");
            }

            sr.Close();
            sw.Close();
        }
    }
}