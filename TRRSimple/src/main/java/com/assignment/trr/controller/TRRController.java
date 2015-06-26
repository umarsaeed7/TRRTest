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
package com.assignment.trr.controller;

import com.assignment.framework.ui.ISubject;
import com.assignment.trr.actions.ConvertAction;
import com.assignment.trr.ui.ConvertScreen;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

/**
 *
 * @author Umar Saeed
 */
public class TRRController implements ActionListener, ISubject, ItemListener
{
    private ConvertScreen convertScreen;

    public TRRController(String title)
    {
        initComponents();
        showConvertScreen(title);
    }

    private void initComponents()
    {
        this.setConvertScreen(new ConvertScreen(TRRController.this));
    }

    private void showConvertScreen(String title)
    {
        this.getConvertScreen().setTitle(title);
        this.getConvertScreen().setVisible(true);
    }

    ////////////////////////////////////////////////////////////////////////////
    //Controller logic - depending upon the actionCommand Action classes are
    //created
    ////////////////////////////////////////////////////////////////////////////
    public void actionPerformed(ActionEvent actionEvent)
    {
        String action = actionEvent.getActionCommand();

        // <editor-fold defaultstate="collapsed" desc=" Convert Code ">
        if (action.equalsIgnoreCase("ConvertAction"))
        {
            try
            {
                new ConvertAction().execute(this);
            }
            catch (Exception ex)
            {
                ex.printStackTrace();
            }
        }
        // </editor-fold>

    }

    public void itemStateChanged(ItemEvent itemEvent)
    {

    }

    /**
     * @return the convertScreen
     */
    public ConvertScreen getConvertScreen()
    {
        return convertScreen;
    }

    /**
     * @param convertScreen the convertScreen to set
     */
    public void setConvertScreen(ConvertScreen convertScreen)
    {
        this.convertScreen = convertScreen;
    }

}
