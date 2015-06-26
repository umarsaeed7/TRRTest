/*
 * Framework
 * Source code is confidential.
 * (c) Copyright Umar Saeed. All rights reserved.
 *
 * Filename: IAction.java
 *
 * Version		Author              Reason
 ** 1.0			Umar Saeed          Created
 *
 */
package com.assignment.trr.actions;

import com.assignment.framework.action.IAction;
import com.assignment.trr.NumToEngCont;
import com.assignment.trr.controller.TRRController;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Umar Saeed
 */
public class ConvertAction implements IAction
{
    ArrayList a, b;
    
    public void execute(Object controller) throws Exception
    {
        TRRController tRRController = (TRRController) controller;
        try
        {
            int no = Integer.parseInt(tRRController.getConvertScreen().getNumber());
            String str = NumToEngCont.getInstance().contToEng(no);
            tRRController.getConvertScreen().setResult(str);
        }
        catch (Exception ex)
        {
            //NumberFormatException
            JOptionPane.showMessageDialog(tRRController.getConvertScreen(), "Incorrect Number", "Error - NumberFormatException", JOptionPane.ERROR_MESSAGE);
        }
        
    }
}
