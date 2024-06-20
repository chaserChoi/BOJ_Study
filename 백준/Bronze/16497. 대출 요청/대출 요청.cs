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
            int n = int.Parse(Console.ReadLine());
            Dictionary<int, int> mp = new Dictionary<int, int>();
            for (int i = 0; i < n; i++)
            {
                string[] input = Console.ReadLine().Split();
                int a = int.Parse(input[0]);
                int b = int.Parse(input[1]);
                for (int j = a; j < b; j++)
                {
                    if (mp.ContainsKey(j))
                        mp[j]++;
                    else 
                        mp[j] = 1;
                }
            }
            int k = int.Parse(Console.ReadLine());

            bool flag = true;
            foreach (var item in mp)
                if (item.Value > k)
                {
                    flag = false;
                    break;
                }
            
            sw.WriteLine(flag ? "1" : "0");

            sw.Flush();
            sw.Close();
            sr.Close();
        }
    }
}
