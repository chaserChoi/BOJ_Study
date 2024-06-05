using System;
using System.IO;

class Program
{
    static void Main()
    {
        using (var sr = new StreamReader(Console.OpenStandardInput()))
        using (var sw = new StreamWriter(Console.OpenStandardOutput()))
        {
            int n = int.Parse(sr.ReadLine());

            for (int i = 1; i <= n; i++)
            {
                string pcName = sr.ReadLine();
                char[] newName = new char[pcName.Length];
                
                for (int j = 0; j < pcName.Length; j++)
                {
                    if (pcName[j] == 'Z')
                        newName[j] = 'A';
                    else
                        newName[j] = (char)(pcName[j] + 1);
                }
                
                sw.WriteLine($"String #{i}");
                sw.WriteLine(new string(newName));
                if (i < n) sw.WriteLine();
            }
        }
    }
}
