using System;
using System.IO;
using System.Text;

class Program
{
    static void Main(string[] args) 
    {
        using (TextReader sr = new StreamReader(Console.OpenStandardInput()))
        using (TextWriter sw = new StreamWriter(Console.OpenStandardOutput()) { AutoFlush = false })
        {
            int T = int.Parse(sr.ReadLine());
            int setA = 0, setB = 0, setC = 0;

            for(int i = 0; i < T; i++)
            {
                string[] input = sr.ReadLine().Split();
                int A = int.Parse(input[0]);
                int B = int.Parse(input[1]);
                int C = int.Parse(input[2]);

                setA += A;
                setB += B;
                setC += C;

                int pack = Math.Min(Math.Min(setA, setB), setC);

                if (pack < 30)
                    sw.WriteLine("NO");
                else
                {
                    sw.WriteLine(pack);
                    setA -= pack;
                    setB -= pack;
                    setC -= pack;
                }
            }

            sw.Flush();
            sr.Close();
            sw.Close();
        }
    }
}
