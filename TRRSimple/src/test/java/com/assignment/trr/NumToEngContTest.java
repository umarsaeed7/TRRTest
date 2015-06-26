/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.assignment.trr;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Umar Saeed
 */
public class NumToEngContTest
{

    // Given
    private NumToEngCont noToEngCont;
    private int number;
    private String strRes;

    // When
    @Before
    public void setUp()
    {
        noToEngCont = NumToEngCont.getInstance();
    }

    @Test
    public void testContToEngDigNegNo()
    {
        // Convert -ve number 
        number = -12;
        strRes = "-ve " + TRRConstants.ENG_DIGS[(-1) * number];
        //Then
        assertEquals(strRes, noToEngCont.contToEng(number));
    }

    /**
     * Test of contToEng method, of class NumToEngCont.
     */
    @Test
    public void testContToEngDig1To19()
    {
        // Check +ve number 1 to 19 only
        for (int i = 1; i < 20; i++)
        {
            strRes = TRRConstants.ENG_DIGS[i];
            assertEquals(strRes, noToEngCont.contToEng(i));
        }
    }

    @Test
    public void testContToEngDig21To29()
    {
        assertEquals(TRRConstants.ENG_DIGS_TENS[0] + " " + TRRConstants.ENG_DIGS[1], noToEngCont.contToEng(21));
        assertEquals(TRRConstants.ENG_DIGS_TENS[0] + " " + TRRConstants.ENG_DIGS[2], noToEngCont.contToEng(22));
        assertEquals(TRRConstants.ENG_DIGS_TENS[0] + " " + TRRConstants.ENG_DIGS[3], noToEngCont.contToEng(23));
        assertEquals(TRRConstants.ENG_DIGS_TENS[0] + " " + TRRConstants.ENG_DIGS[4], noToEngCont.contToEng(24));
        assertEquals(TRRConstants.ENG_DIGS_TENS[0] + " " + TRRConstants.ENG_DIGS[5], noToEngCont.contToEng(25));
        assertEquals(TRRConstants.ENG_DIGS_TENS[0] + " " + TRRConstants.ENG_DIGS[6], noToEngCont.contToEng(26));
        assertEquals(TRRConstants.ENG_DIGS_TENS[0] + " " + TRRConstants.ENG_DIGS[7], noToEngCont.contToEng(27));
        assertEquals(TRRConstants.ENG_DIGS_TENS[0] + " " + TRRConstants.ENG_DIGS[8], noToEngCont.contToEng(28));
        assertEquals(TRRConstants.ENG_DIGS_TENS[0] + " " + TRRConstants.ENG_DIGS[9], noToEngCont.contToEng(29));
    }

    @Test
    public void testContToEngDigTens10To90()
    {
        for (int i = 2; i < 10; i++)
        {
            assertEquals(TRRConstants.ENG_DIGS_TENS[i - 2], noToEngCont.contToEng(10 * i));
        }
    }

    @Test
    public void testContToEngRandomNo()
    {
        assertEquals("ninety nine", noToEngCont.contToEng(99));
        assertEquals("one hundred", noToEngCont.contToEng(100));
        assertEquals("one hundred one", noToEngCont.contToEng(101));
        assertEquals("one hundred five", noToEngCont.contToEng(105));
        assertEquals("one hundred ninety one", noToEngCont.contToEng(191));
        assertEquals("two hundred", noToEngCont.contToEng(200));
        assertEquals("two hundred ninety nine", noToEngCont.contToEng(299));
        assertEquals("nine hundred", noToEngCont.contToEng(900));
        assertEquals("nine hundred ninety nine", noToEngCont.contToEng(999));
        assertEquals("one thousand", noToEngCont.contToEng(1000));
        assertEquals("two thousand", noToEngCont.contToEng(2000));
        assertEquals("nine thousand", noToEngCont.contToEng(9000));
        assertEquals("two thousand five", noToEngCont.contToEng(2005));
        assertEquals("one thousand nine hundred ninety one", noToEngCont.contToEng(1991));
        assertEquals("ten thousand", noToEngCont.contToEng(10000));
        assertEquals("nine hundred ninety nine thousand nine hundred ninety nine", noToEngCont.contToEng(999999));
        assertEquals("one million", noToEngCont.contToEng(1000000));
        assertEquals("nine million", noToEngCont.contToEng(9000000));
        assertEquals("nine hundred ninety nine million", noToEngCont.contToEng(999000000));
        assertEquals("ninety one million nine hundred forty one thousand seven hundred eighty one", noToEngCont.contToEng(91941781));
    }
}
