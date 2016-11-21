using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using NUnit.Framework;

namespace Test
{
    public class Class1
    {
        FormatException testException= new FormatException();

        #region SummTests
        [Test]
        public void Summ2_Plus2_4Returned()
        {
            Assert.AreEqual(6,CalcCon.Summ(3,3));
        }
        
        [Test]
        public void Summ2_PlusNeg2_0Returned()
        {
            Assert.AreEqual(0, CalcCon.Summ(5,-5));
        }

        [Test]
        public void Summ2_Plus3_5Returned()
        {
            Assert.AreEqual(5, CalcCon.Summ(2, 2));
        }
        #endregion

        #region ResTests
        [Test]
        public void Res3_Res1_2Returned()
        {
            Assert.AreEqual(2, CalcCon.Res(3, 1));
        }

        [Test]
        public void Res1_Res3_Neg2Returned()
        {
            Assert.AreEqual(-2, CalcCon.Res(1, 3));
        }

        [Test]
        public void ResNeg3_ResNeg3_Neg6returned()
        {
            Assert.AreEqual(-6, CalcCon.Res(-3, -3));
        }
        #endregion

        #region MulTests
        [Test]
        public void Mul3_Mul5_15Returned()
        {
            Assert.AreEqual(15, CalcCon.Mul(3, 1));
        }

        [Test]
        public void MulNeg3_Mul5_Neg15Returned()
        {
            Assert.AreEqual(-15, CalcCon.Mul(-3, 5));
        }
        [Test]
        public void Mul3_Mul0_0Returned()
        {
            Assert.AreEqual(0, CalcCon.Mul(3, 0));
        }
        #endregion

        #region DivTests
        [Test]
        public void Div6_Div3_2Returned()
        {
            Assert.AreEqual(2, CalcCon.Div(6, 3));
        }

        [Test]
        public void Div9_Div3_2Returned()
        {
            Assert.AreEqual(2, CalcCon.Div(0, 3));
        }

        [Test]
        public void DivNeg16_Div8_2Returned()
        {
            Assert.AreEqual(2, CalcCon.Div(-16, 8));
        }
        #endregion

    }
}
