using System;
using System.IO;

class Program
{
    static void Main(string[] args)
    {
        using (var sr = new StreamReader(Console.OpenStandardInput()))
        using (var sw = new StreamWriter(Console.OpenStandardOutput()) { AutoFlush = true } )
        {
            int n = int.Parse(sr.ReadLine());
            DateTime electDate = new DateTime(2007, 2, 27);
            DateTime votingAgeLimit = electDate.AddYears(-18);

            for (int i = 0; i < n; i++)
            {
                string[] date = sr.ReadLine().Split(' ');
                int y = int.Parse(date[0]);
                int m = int.Parse(date[1]);
                int d = int.Parse(date[2]);

                DateTime birthDate = new DateTime(y, m, d);

                if (birthDate <= votingAgeLimit)
                    sw.WriteLine("Yes");
                else
                    sw.WriteLine("No");
            }

            sw.Flush();
        }
    }
}
