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
            int t = int.Parse(sr.ReadLine());
            Dictionary<string, char> dic = new Dictionary<string, char>();

            for (int i = 0; i < t; i++)
            {
                string[] line = sr.ReadLine().Split();
                char c = line[0][0];
                string s = line[1];
                dic[s] = c;
            }

            string str = sr.ReadLine();
            StringBuilder sb = new StringBuilder();

            for (int i = 0; i < str.Length; i += 4)
            {
                string seg = str.Substring(i, 4);
                if (dic.TryGetValue(seg, out char trans))
                    sb.Append(trans);
                else
                    sb.Append('?');
            }

            sw.WriteLine(sb.ToString());

            sw.Flush();
            sw.Close();
            sr.Close();
        }
    }
}
