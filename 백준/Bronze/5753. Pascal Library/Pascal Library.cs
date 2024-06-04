using System;
using System.IO;

class Program
{
    static void Main()
    {
        using (var sr = new StreamReader(Console.OpenStandardInput()))
        using (var sw = new StreamWriter(Console.OpenStandardOutput()))
        {
            while (true) {
                string[] input = sr.ReadLine().Split();
                int N = int.Parse(input[0]);
                int D = int.Parse(input[1]);

                if (N == 0 && D == 0) break;

                bool[] attendedAllDinners = new bool[N];
                for (int i = 0; i < N; i++) attendedAllDinners[i] = true; 
                
                for (int i = 0; i < D; i++) {
                    input = sr.ReadLine().Split();
                    for (int j = 0; j < N; j++) {
                        if (input[j] == "0") attendedAllDinners[j] = false; 
                    }
                }

                bool found = false;
                for (int i = 0; i < N; i++) {
                    if (attendedAllDinners[i]) {
                        found = true;
                        break;
                    }
                }

                sw.WriteLine(found ? "yes" : "no");
            }
        }
    }
}
