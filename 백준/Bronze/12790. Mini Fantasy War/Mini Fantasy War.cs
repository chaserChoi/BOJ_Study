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
            StringBuilder sb = new StringBuilder();

            for (int i = 0; i < T; i++)
            {
                string[] data = sr.ReadLine().Split();
                int hp = int.Parse(data[0]);
                int mp = int.Parse(data[1]);
                int attack = int.Parse(data[2]);
                int def = int.Parse(data[3]);
                int hpDiff = int.Parse(data[4]);
                int mpDiff = int.Parse(data[5]);
                int attDif = int.Parse(data[6]);
                int defDiff = int.Parse(data[7]);

                int finalHp = Math.Max(1, hp + hpDiff);
                int finalMp = Math.Max(1, mp + mpDiff);
                int finalAtt = Math.Max(0, attack + attDif);
                int finalDef = def + defDiff;

                int final = 1 * finalHp + 5 * finalMp + 2 * finalAtt + 2 * finalDef;
                sb.AppendLine(final.ToString());
            }

            sw.WriteLine(sb.ToString());

            sw.Flush();
            sw.Close();
            sr.Close();
        }
    }
}
