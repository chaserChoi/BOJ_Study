using System;
using System.IO;
using System.Text;
using System.Collections.Generic;

class Program {
    static void Main(string[] args) {
        TextReader sr = new StreamReader(Console.OpenStandardInput());
        TextWriter sw = new StreamWriter(Console.OpenStandardOutput());
        
        int n = int.Parse(sr.ReadLine());
        int[] t = new int[n];
        int[] s = new int[n];

        for (int i = 0; i < n; i++) {
            string[] input = sr.ReadLine().Split();
            t[i] = int.Parse(input[0]);
            s[i] = int.Parse(input[1]);
        }

        int f = 0;
        int max = 0;
        for (int i = 0; i < n; i++) {
            if (s[i] > max) {
                max = s[i];
                f = i;
            }
        }

        int penalty = 0;
        if (s[f] == 0)
            penalty = 0;
        else if (s[f] == 1 || s[f] == 4)
            penalty = t[f] + (f * 20);

        sw.WriteLine(penalty);

        sw.Flush();
        sw.Close();
        sr.Close();
    }
}