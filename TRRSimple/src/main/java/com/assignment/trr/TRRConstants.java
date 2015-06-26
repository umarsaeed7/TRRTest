/*
 * Framework
 * Source code is confidential.
 * (c) Copyright Umar Saeed. All rights reserved.
 *
 * Filename: TRR.java
 *
 * Version		Author              Reason
 ** 1.0			Umar Saeed          Created
 *
 */
package com.assignment.trr;

/**
 *
 * @author Umar Saeed
 */
public interface TRRConstants
{
    public final static String name = "TRR";
    public final static String majorVersion = "1";
    public final static String minorVersion = "0";

    public static final String[] ENG_DIGS =
    {
        "", // 0
        "one", // 1
        "two", // 2
        "three", // 3
        "four", // 4
        "five", // 5
        "six", // 6
        "seven", // 7
        "eight", // 8
        "nine", // 9
        "ten", // 10
        "eleven", // 11
        "twelve", // 12
        "thirteen", // 13
        "fourteen", // 14
        "fifteen", // 15
        "sixteen", // 16
        "seventeen", // 17
        "eighteen", // 18
        "nineteen"      // 19
    };

    public static final String[] ENG_DIGS_TENS =
    {
        "twenty", // 20
        "thirty", // 30
        "forty", // 40
        "fifty", // 50
        "sixty", // 60
        "seventy", // 70
        "eighty", // 80
        "ninety"  // 90
    };

    public static final String[] ENG_DIG_MORE_TENS =
    {
        "hundred", // 100
        "thousand", // 1000
        "million", // 1000000
        "billion"  // 1000000000
    };
}
