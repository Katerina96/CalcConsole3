using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Test
{
    class CalcCon
    {
        public static float Summ(float a, float b)
        {
            return a + b;
        }

        public static float Res(float a, float b)
        {
            return a - b;
        }

        public static float Mul(float a, float b)
        {
            return a * b;
        }

        public static float Div(float a, float b)
        {
            if (b != 0) return a / b;

            else throw new DivideByZeroException();
        }
    }
}
