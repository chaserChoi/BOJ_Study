using System;
using System.IO;
using System.Text;
using System.Collections.Generic;

class Program {
    static void Main(string[] args) {
        TextReader sr = new StreamReader(Console.OpenStandardInput());
        TextWriter sw = new StreamWriter(Console.OpenStandardOutput());
        
        int N = int.Parse(sr.ReadLine());

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N - i - 1; j++)
                sw.Write(" ");

            for (int j = 0; j <= i; j++)
                sw.Write("* ");

            sw.WriteLine();
        }

        sw.Flush();
        sw.Close();
        sr.Close();
    }
}