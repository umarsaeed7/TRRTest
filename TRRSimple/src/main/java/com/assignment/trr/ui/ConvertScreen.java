/*
 * Framework
 * Source code is confidential.
 * (c) Copyright Umar Saeed. All rights reserved.
 *
 * Filename: LoginScreen.java
 *
 * Version		Author              Reason
 ** 1.0			Umar Saeed          Created
 *
 */
package com.assignment.trr.ui;

import com.assignment.trr.controller.TRRController;
import java.awt.event.KeyEvent;

/**
 *
 * @author Umar Saeed
 */
public class ConvertScreen extends javax.swing.JFrame
{

    /**
     * Creates new form LoginScreen
     */
    public ConvertScreen(TRRController controller)
    {
        this.controller = controller;
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        lblPassword = new javax.swing.JLabel();
        btnConvert = new javax.swing.JButton();
        btnConvert.setMnemonic(KeyEvent.VK_ENTER);
        getRootPane().setDefaultButton(btnConvert);
        txtUserNo = new javax.swing.JTextField();
        txtResult = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        lblPassword.setText("Number to English");

        btnConvert.setText("Convert");
        btnConvert.setActionCommand("ConvertAction");
        btnConvert.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnConvertActionPerformed(evt);
            }
        });

        txtUserNo.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyTyped(java.awt.event.KeyEvent evt)
            {
                keyTypedForNumber(evt);
            }
        });

        txtResult.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(txtResult, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(layout.createSequentialGroup()
                        .add(lblPassword)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(txtUserNo, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 168, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(btnConvert, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(txtUserNo)
                    .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                        .add(lblPassword)
                        .add(btnConvert)))
                .add(18, 18, 18)
                .add(txtResult, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnConvertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConvertActionPerformed
        controller.actionPerformed(evt);
    }//GEN-LAST:event_btnConvertActionPerformed

    private void keyTypedForNumber(java.awt.event.KeyEvent evt)//GEN-FIRST:event_keyTypedForNumber
    {//GEN-HEADEREND:event_keyTypedForNumber
        // TODO add your handling code here:
        int k = evt.getKeyChar();
        if ((k > 47 && k < 58) || (k == 8))
        {
        }
        else
        {
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);
        }
    }//GEN-LAST:event_keyTypedForNumber

    public void setResult(String result)
    {
        this.txtResult.setText(result);
    }

    public String getNumber()
    {
        return this.txtUserNo.getText();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConvert;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel txtResult;
    private javax.swing.JTextField txtUserNo;
    // End of variables declaration//GEN-END:variables
    private TRRController controller;
}
