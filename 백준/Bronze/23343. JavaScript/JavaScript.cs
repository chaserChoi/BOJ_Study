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
            string[] line = sr.ReadLine().Split();
            string x = line[0];
            string y = line[1];

            if (IsNumeric(x) && IsNumeric(y))
            {
                double numX = Convert.ToDouble(x);
                double numY = Convert.ToDouble(y);
                double ans = numX - numY;

                if (ans % 1 == 0)
                    sw.WriteLine((int)ans);
                else
                    sw.WriteLine(ans);
            } else
                sw.WriteLine("NaN");

            sw.Flush();
            sw.Close();
            sr.Close();
        }
    }

    static bool IsNumeric(string str)
    {
        foreach (char c in str)
        {
            if (!char.IsDigit(c))
                return false;
        }

        return true;
    }
}
