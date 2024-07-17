using System;
using System.IO;
using System.Text;

class Program
{
    static void Main(string[] args)
    {
        using (var sr = new StreamReader(Console.OpenStandardInput()))
        using (var sw = new StreamWriter(Console.OpenStandardOutput()))
        {
            int N = int.Parse(sr.ReadLine());
            bool flag = false;

            for (int i = 0; i < N; i++)
            {
                string name = sr.ReadLine();
                if (name == "anj")
                {
                    flag = true;
                    break;
                }
            }

            if (flag) 
                sw.WriteLine("뭐야;");
            else
                sw.WriteLine("뭐야?");

            sw.Flush();
            sw.Close();
            sr.Close();
        }
    }
}
