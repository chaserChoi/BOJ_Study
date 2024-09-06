using System;
using System.Globalization;
using System.IO;
using System.Text;

class Program
{
    static void Main(string[] args)
    {
        using (var sr = new StreamReader(Console.OpenStandardInput()))
        using (var sw = new StreamWriter(Console.OpenStandardOutput()) { AutoFlush = true })
        {
            string[] lineU = sr.ReadLine().Split();
            int C_U = int.Parse(lineU[0]);
            int D_U = int.Parse(lineU[1]);

            string[] lineD = sr.ReadLine().Split();
            int C_D = int.Parse(lineD[0]);
            int D_D = int.Parse(lineD[1]);

            string[] lineP = sr.ReadLine().Split();
            int C_P = int.Parse(lineP[0]);
            int D_P = int.Parse(lineP[1]);

            int H = int.Parse(sr.ReadLine());

            int totalDmg = D_U + D_D + D_P;
            H -= totalDmg;

            if (H <= 0)
            {
                sw.WriteLine(0);
                return;
            }

            int t = 0;
            while (H > 0)
            {
                t++;

                int currDmg = 0;
                if (t % C_U == 0)
                    currDmg += D_U;
                if (t % C_D == 0)
                    currDmg += D_D;
                if (t % C_P == 0)
                    currDmg += D_P;

                H -= currDmg;
            }

            sw.WriteLine(t);

            sw.Flush();
            sw.Close();
            sr.Close();
        }
    }
}
