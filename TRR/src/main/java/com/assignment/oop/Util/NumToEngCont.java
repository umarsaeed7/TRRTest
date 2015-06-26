/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.assignment.oop.Util;

import static com.assignment.oop.Util.TestCons.ENG_DIGS;
import static com.assignment.oop.Util.TestCons.ENG_DIGS_TENS;

/**
 *
 * @author Umar Saeed
 */
public class NumToEngCont
{
    private static NumToEngCont util;

    public static NumToEngCont getInstance()
    {
        if (util == null)
        {
            util = new NumToEngCont();
        }
        return util;
    }

    public String contToEng(final int n)
    {
        if (n < 0)
        {
            return "-ve " + contToEng(-n);
        }

        if (n < 20)
        {
            return ENG_DIGS[n];
        }

        if (n < 100)
        {
            return ENG_DIGS_TENS[n / 10 - 2] + ((n % 10 != 0) ? " " : "") + ENG_DIGS[n % 10];
        }

        if (n < 1000)
        {
            return ENG_DIGS[n / 100] + " " + TestCons.ENG_DIG_MORE_TENS[0] + ((n % 100 != 0) ? " " : "") + contToEng(n % 100);
        }

        if (n < 1000000)
        {
            return contToEng(n / 1000) + " " + TestCons.ENG_DIG_MORE_TENS[1] + ((n % 1000 != 0) ? " " : "") + contToEng(n % 1000);
        }

        if (n < 1000000000)
        {
            return contToEng(n / 1000000) + " " + TestCons.ENG_DIG_MORE_TENS[2] + ((n % 1000000 != 0) ? " " : "") + contToEng(n % 1000000);
        }

        String s1 = contToEng(n / 1000000000);
        String s2 = TestCons.ENG_DIG_MORE_TENS[3];
        String s3 = contToEng(n % 1000000000);
        String s4 = s1 + " " + s2 + ((n % 1000000000 != 0) ? " " : "") + s3;
        return s4;
    }
}
