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
            string team1 = sr.ReadLine();
            string team2 = sr.ReadLine();

            int cnt = int.Parse(sr.ReadLine());
            string shots = sr.ReadLine();

            int team1Score = 0, team2Score = 0;
            for (int i = 0; i < cnt; i++)
            {
                char sh = shots[i];
                switch (sh)
                {
                    case 'H':
                        if (i % 4 == 0 || i % 4 == 2) team1Score++;
                        else team2Score++;
                        break;
                    case 'D':
                        if (i % 4 == 0 || i % 4 == 2) team1Score += 2;
                        else team2Score += 2;
                        break;
                    case 'O':
                        if (i % 4 == 0 || i % 4 == 2) team2Score++;
                        else team1Score++;
                        break;
                }

                if (team1Score > 6) 
                {
                    sw.Write($"{team1} 7 {team2} {team2Score}. {team1} has won.");
                    return;
                }
                if (team2Score > 6)
                {
                    sw.Write($"{team1} {team1Score} {team2} 7. {team2} has won.");
                    return;
                }
            }

            sw.Write($"{team1} {team1Score} {team2} {team2Score}. ");
            if (team1Score > team2Score)
                sw.WriteLine($"{team1} is winning.");
            else if (team1Score < team2Score)
                sw.WriteLine($"{team2} is winning.");
            else 
                sw.WriteLine("All square.");

            sw.Flush();
            sw.Close();
            sr.Close();
        }
    }
}
