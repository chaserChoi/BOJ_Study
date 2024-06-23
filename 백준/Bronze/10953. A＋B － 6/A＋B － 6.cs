using System;
using System.IO;
using System.Text;
using System.Collections.Generic;

class Program {
    static void Main(string[] args) {
        TextReader sr = new StreamReader(Console.OpenStandardInput());
        TextWriter sw = new StreamWriter(Console.OpenStandardOutput());
        
        int T = int.Parse(sr.ReadLine());

        for (int i = 0; i < T; i++) {
            string[] input = sr.ReadLine().Split(',');
            int A = int.Parse(input[0]);
            int B = int.Parse(input[1]);
            sw.WriteLine(A + B);
        }

        sw.Flush();
        sw.Close();
        sr.Close();
    }
}