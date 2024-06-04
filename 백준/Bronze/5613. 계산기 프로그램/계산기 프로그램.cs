using System;
using System.IO;

class Program {
    static void Main()
    {
        using (StreamReader sr = new StreamReader(Console.OpenStandardInput()))
        using (StreamWriter sw = new StreamWriter(Console.OpenStandardOutput()))
        {
            long result = long.Parse(sr.ReadLine());
            string operation = null;

            while (true) {
                string input = sr.ReadLine();

                if (input == "=") break;

                if (operation == null) operation = input;
                else {
                    long num = long.Parse(input);

                    switch (operation) {
                        case "+":
                            result += num;
                            break;
                        case "-":
                            result -= num;
                            break;
                        case "*":
                            result *= num;
                            break;
                        case "/":
                            result /= num;
                            break;
                    }

                    operation = null;
                }
            }
            
            sw.WriteLine(result);
        }
    }
}
