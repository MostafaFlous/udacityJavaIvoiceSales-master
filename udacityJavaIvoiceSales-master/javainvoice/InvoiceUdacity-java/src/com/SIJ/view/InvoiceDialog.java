
package com.SIJ.view;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author DELL
 */
public class InvoiceDialog extends JDialog {
    private JTextField custNameCol;
    private JTextField invDateCol;
    private JLabel custNameLbl;
    private JLabel invDateLbl;
    private JButton okBtn;
    private JButton cancelBtn;

    public InvoiceDialog(InvoiceHomePage frame) {
        custNameLbl = new JLabel("Customer Name:");
        custNameCol = new JTextField(20);
        invDateLbl = new JLabel("Invoice Date:");
        invDateCol = new JTextField(20);
        okBtn = new JButton("OK");
        cancelBtn = new JButton("Cancel");
        
        okBtn.setActionCommand("createInvoiceOK");
        cancelBtn.setActionCommand("createInvoiceCancel");
        
        okBtn.addActionListener(frame.getController());
        cancelBtn.addActionListener(frame.getController());
        setLayout(new GridLayout(3, 2));
        
        add(invDateLbl);
        add(invDateCol);
        add(custNameLbl);
        add(custNameCol);
        add(okBtn);
        add(cancelBtn);
        
        pack();
        
    }

    public JTextField getCustNameField() {
        return custNameCol;
    }

    public JTextField getInvDateField() {
        return invDateCol;
    }
    
}
