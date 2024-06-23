using System;
using System.IO;
using System.Text;
using System.Collections.Generic;

class Program {
    static void Main(string[] args) {
        TextReader sr = new StreamReader(Console.OpenStandardInput());
        TextWriter sw = new StreamWriter(Console.OpenStandardOutput());
        
        int N = int.Parse(sr.ReadLine());
        int sum = 0;

        for (int i = 0; i < N; i++) {
            int op = int.Parse(sr.ReadLine());
            sum += (op == 0) ? -1 : 1;
        }

        sw.WriteLine(sum > 0 ? "Junhee is cute!" : "Junhee is not cute!");

        sw.Flush();
    }
}