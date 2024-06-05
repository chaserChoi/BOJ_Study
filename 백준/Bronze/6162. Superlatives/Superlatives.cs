using System;
using System.IO;

class Program
{
    static void Main()
    {
        using (var sr = new StreamReader(Console.OpenStandardInput()))
        using (var sw = new StreamWriter(Console.OpenStandardOutput()))
        {
            int K = int.Parse(sr.ReadLine()); 

            for (int i = 1; i <= K; i++)
            {
                string[] input = sr.ReadLine().Split();
                int E = int.Parse(input[0]); 
                int A = int.Parse(input[1]); 

                sw.WriteLine($"Data Set {i}:");

                if (E <= A)
                    sw.WriteLine("no drought");               
                else
                {
                    int factor = E / A;
                    if (factor <= 5)                    
                        sw.WriteLine("drought");                   
                    else
                    {
                        int megaCnt = 0;
                        int threshold = 5;
                        while (factor > threshold)
                        {
                            megaCnt++;
                            threshold *= 5;
                        }

                        string result = new string(' ', megaCnt).Replace(" ", "mega ") + "drought";
                        sw.WriteLine(result.Trim());
                    }
                }

                sw.WriteLine();
            }
        }
    }
}
