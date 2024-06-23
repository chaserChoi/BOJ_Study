using System;
using System.IO;
using System.Collections.Generic;

class Program {
    static void Main(string[] args) {
        using (var sr = new StreamReader(Console.OpenStandardInput())) {
            using (var sw = new StreamWriter(Console.OpenStandardOutput())) {
                string[] input = sr.ReadLine().Split();
                int N = int.Parse(input[0]);
                int M = int.Parse(input[1]);

                List<int>[] friends = new List<int>[N + 1];
                for (int i = 1; i <= N; i++) 
                    friends[i] = new List<int>();

                for (int i = 0; i < M; i++) {
                    input = sr.ReadLine().Split();
                    int a = int.Parse(input[0]);
                    int b = int.Parse(input[1]);
                    friends[a].Add(b);
                    friends[b].Add(a);
                }

                for (int i = 1; i <= N; i++)
                    sw.WriteLine(friends[i].Count);
            }
        }
    }
}