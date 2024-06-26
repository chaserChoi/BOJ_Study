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
            int n = int.Parse(sr.ReadLine());
            string[] arr = new string[n];
            for (int i = 0; i < n; i++)
                arr[i] = sr.ReadLine();
            int code = int.Parse(sr.ReadLine());

            switch (code)
            {
                case 1:
                    for (int i = 0; i < n; i++)
                        sw.WriteLine(arr[i]);
                    break;
                case 2:
                    for (int i = 0; i < n; i++) 
                    {
                        for (int j = arr[i].Length - 1; j >= 0; j--)
                            sw.Write(arr[i][j]);
                        sw.WriteLine();
                    }
                    break;
                case 3:
                    for (int i = n - 1; i >= 0; i--)
                        sw.WriteLine(arr[i]);
                    break;
            }
        }
    }
}
