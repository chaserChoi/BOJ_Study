using System;
using System.IO;
using System.Text;

class Program
{
    static void Main(string[] args)
    {
        using (var sr = new StreamReader(Console.OpenStandardInput()))
        using (var sw = new StreamWriter(Console.OpenStandardOutput()) { AutoFlush = true })
        {
            int n = int.Parse(sr.ReadLine());
            
            while (n-- > 0)
            {
                string s = sr.ReadLine();
                int k = s.Length;

                char[,] v = new char[k, k];

                for (int i = 0; i < k; i++)
                {
                    for (int j = 0; j < k; j++)
                        v[i, j] = ' ';
                }

                for (int i = 0; i < k; i++)
                    v[0, i] = s[i];

                for (int i = 0; i < k; i++)
                    v[i, 0] = s[i];

                for (int i = 0; i < k; i++)
                    v[k - 1, i] = s[k - i - 1];
                
                for (int i = 0; i < k; i++)
                    v[i, k - 1] = s[k - i - 1];

                for (int i = 0; i < k; i++)
                {
                    for (int j = 0; j < k; j++)
                        sw.Write(v[i, j]);
                    sw.WriteLine();
                }
            }

            sw.Flush();
            sw.Close();
            sr.Close();
        }
    }
}
