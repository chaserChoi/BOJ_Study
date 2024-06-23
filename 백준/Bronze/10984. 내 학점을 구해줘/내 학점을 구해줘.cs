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
            int N = int.Parse(sr.ReadLine());
            double credits = 0;
            double totalGPA = 0;

            for (int j = 0; j < N; j++) {
                string[] input = sr.ReadLine().Split(' ');
                int c = int.Parse(input[0]);
                double grade = double.Parse(input[1]);
                credits += c;
                totalGPA += c * grade;
            }

            double GPA = totalGPA / credits;
            sw.WriteLine($"{(int)credits} {GPA:F1}");
        }

        sw.Flush();
        sw.Close();
        sr.Close();
    }
}