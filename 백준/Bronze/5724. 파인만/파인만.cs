using System;
using System.IO;

class Program
{
    static void Main()
    {
        TextReader tr = Console.In;
        TextWriter tw = Console.Out;

        while (true)
        {
            string line = tr.ReadLine();
            if (line == "0") break;

            int N = int.Parse(line);
            int result = CalculateSquares(N);
            tw.WriteLine(result);
        }

        tw.Flush();
    }

    static int CalculateSquares(int N)
    {
        int cnt = 0;
        for (int i = 1; i <= N; i++) cnt += i * i;
        return cnt;
    }
}
