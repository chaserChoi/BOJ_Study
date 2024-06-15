using System;
using System.IO;
using System.Text;

class Program
{
    static void Main(string[] args)
    {
        using (StreamReader sr = new StreamReader(Console.OpenStandardInput()))
        using (StreamWriter sw = new StreamWriter(Console.OpenStandardOutput()) { AutoFlush = false })
        {
            int T = int.Parse(sr.ReadLine());

            for (int i = 1; i <= T; i++)
            {
                string[] input = sr.ReadLine().Split();
                int a = int.Parse(input[0]);
                int b = int.Parse(input[1]);
                int c = int.Parse(input[2]);

                bool isRightTri = false;

                if (a * a + b * b == c * c)
                    isRightTri = true;
                else if (b * b + c * c == a * a)
                    isRightTri = true;
                else if (a * a + c * c == b * b)
                    isRightTri = true;

                sw.WriteLine($"Case #{i}: {(isRightTri ? "YES" : "NO")}");
            }

            sw.Close();
            sr.Close();
        }
    }
}
