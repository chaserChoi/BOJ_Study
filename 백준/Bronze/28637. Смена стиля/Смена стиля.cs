using System;
using System.Globalization;
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
            StringBuilder sb = new StringBuilder();

            for (int i = 0; i < n; i++)
            {
                string str = sr.ReadLine();
                sb.Append(ConvertToSnakeCase(str));
                sb.AppendLine();
            }

            sw.Write(sb.ToString());

            sw.Flush();
            sw.Close();
            sr.Close();
        }
    }

    static string ConvertToSnakeCase(string str)
    {
        StringBuilder sb = new StringBuilder();

        foreach (char c in str)
        {
            if (char.IsUpper(c))
            {
                if (sb.Length > 0)
                    sb.Append('_');
                sb.Append(char.ToLower(c));
            }
            else
                sb.Append(c);
        }
        
        return sb.ToString();
    }
}
