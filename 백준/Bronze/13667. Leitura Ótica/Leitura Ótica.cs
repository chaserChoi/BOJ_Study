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
            while (true)
            {
                int N = int.Parse(sr.ReadLine());
                if (N == 0) break;

                for (int i = 0; i < N; i++)
                {
                    string[] line = sr.ReadLine().Split();
                    int A = int.Parse(line[0]);
                    int B = int.Parse(line[1]);
                    int C = int.Parse(line[2]);
                    int D = int.Parse(line[3]);
                    int E = int.Parse(line[4]);

                    if (A <= 127 && B > 127 && C > 127 && D > 127 && E > 127)
                        sw.WriteLine("A");
                    else if (A > 127 && B <= 127 && C > 127 && D > 127 && E > 127)
                        sw.WriteLine("B");
                    else if (A > 127 && B > 127 && C <= 127 && D > 127 && E > 127)
                        sw.WriteLine("C");
                    else if (A > 127 && B > 127 && C > 127 && D <= 127 && E > 127)
                        sw.WriteLine("D");
                    else if (A > 127 && B > 127 && C > 127 && D > 127 && E <= 127)
                        sw.WriteLine("E");
                    else
                        sw.WriteLine("*");
                }
            }

            sw.Flush();
            sw.Close();
            sr.Close();
        }
    }
}
