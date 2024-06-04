using System;

class Program
{
    static void Main(string[] args)
    {
        while (true)
        {
            int maryWin = 0, johnWin = 0;
            int n = int.Parse(Console.ReadLine());
            if (n == 0) break;

            string[] inputs = Console.ReadLine().Split(' ');
            for (int i = 0; i < n; i++)
            {
                int x = int.Parse(inputs[i]);
                if (x == 0) maryWin++;
                else johnWin++;
            }

            Console.WriteLine($"Mary won {maryWin} times and John won {johnWin} times");
        }
    }
}
