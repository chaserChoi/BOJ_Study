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
            char[] oppo = new char[4];
            string mbti = sr.ReadLine();

            oppo[0] = (mbti[0] == 'E') ? 'I' : 'E';
            oppo[1] = (mbti[1] == 'S') ? 'N' : 'S';
            oppo[2] = (mbti[2] == 'T') ? 'F' : 'T';
            oppo[3] = (mbti[3] == 'J') ? 'P' : 'J';

            sw.WriteLine(new string(oppo));

            sw.Flush();
            sw.Close();
            sr.Close();
        }
    }
}
