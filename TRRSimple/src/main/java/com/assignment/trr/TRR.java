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

import com.assignment.trr.controller.TRRController;

/**
 *
 * @author Umar Saeed
 */
public class TRR
{

    public TRR()
    {
        new TRRController(TRRConstants.name + " " + getVersion());
    }

    public static String getVersion()
    {
        return TRRConstants.majorVersion + "." + TRRConstants.minorVersion;
    }

    public static void main(String[] args) throws Exception
    {
        new TRR();
    }
}
