using System;
using System.IO;
using System.Text;

class Program
{
    static void Main(string[] args)
    {
        using (var sr = new StreamReader(Console.OpenStandardInput()))
        using (var sw = new StreamWriter(Console.OpenStandardOutput()) { AutoFlush = true })
        {
            int n = int.Parse(sr.ReadLine());

            for (int i = 0; i < n; i++)
            {
                string[] line1 = sr.ReadLine().Split();
                int a1 = int.Parse(line1[0]);
                int b1 = int.Parse(line1[1]);
                int c1 = int.Parse(line1[2]);

                string[] line2 = sr.ReadLine().Split();
                int a2 = int.Parse(line2[0]);
                int b2 = int.Parse(line2[1]);
                int c2 = int.Parse(line2[2]);

                int[] first = { a1, b1, c1 };
                int[] second = { a2, b2, c2 };

                Array.Sort(first);
                Array.Sort(second);

                if (first[0] * first[0] + first[1] * first[1] == first[2] * first[2] &&
                    second[0] * second[0] + second[1] * second[1] == second[2] * second[2] && 
                    first[0] == second[0] && first[1] == second[1])
                    sw.WriteLine("YES");
                else
                    sw.WriteLine("NO");
            }

            sw.Flush();
            sw.Close();
            sr.Close();
        }
    }
}
