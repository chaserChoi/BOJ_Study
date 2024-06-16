using System;
using System.ComponentModel;
using System.IO;
using System.Text;

class Program
{
    static void Main(string[] args)
    {
        using (TextReader sr = new StreamReader(Console.OpenStandardInput()))
        using (TextWriter sw = new StreamWriter(Console.OpenStandardOutput()) { AutoFlush = false })
        {
            var cntSons = int.Parse(sr.ReadLine()!);
            var exp = int.Parse(sr.ReadLine()!);

            List<int> posPotential = new List<int>();
            List<int> negPotential = new List<int>();
            var potentials = sr.ReadLine()!.Split().Select(int.Parse).ToArray();
            for (int i = 0; i < cntSons; i++)
            {
                if (potentials[i] > 0) posPotential.Add(potentials[i]);
                else negPotential.Add(potentials[i]);
            }

            posPotential.Sort((a, b) => b.CompareTo(a));
            negPotential.Sort((a, b) => Math.Abs(b).CompareTo(Math.Abs(a)));

            int max = 0;
            foreach (var potential in posPotential)
                max += (int)Math.Pow(potential, exp);

            if (exp % 2 == 0)
            {
                foreach (var potentail in negPotential)
                    max += (int)Math.Pow(potentail, exp);
            }

            sw.WriteLine(max);

            sw.Close();
            sr.Close();
        }
    }
}
