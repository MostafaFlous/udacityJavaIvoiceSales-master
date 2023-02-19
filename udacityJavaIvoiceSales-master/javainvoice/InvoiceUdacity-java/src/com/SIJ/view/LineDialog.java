
package com.SIJ.view;

import java.awt.GridLayout;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author DELL
 */
public class LineDialog extends JDialog{
    private JTextField itemNameCol;
    private JTextField itemCountCol;
    private JTextField itemPriceCol;
    private JLabel itemNameLbl;
    private JLabel itemCountLbl;
    private JLabel itemPriceLbl;
    private JButton okBtn;
    private JButton cancelBtn;
    
    public LineDialog(InvoiceHomePage frame) {
        itemNameCol = new JTextField(20);
        itemNameLbl = new JLabel("Item Name");
        
        itemCountCol = new JTextField(20);
        itemCountLbl = new JLabel("Item Count");
        
        itemPriceCol = new JTextField(20);
        itemPriceLbl = new JLabel("Item Price");
        
        okBtn = new JButton("OK");
        cancelBtn = new JButton("Cancel");
        
        okBtn.setActionCommand("createLineOK");
        cancelBtn.setActionCommand("createLineCancel");
        
        okBtn.addActionListener((ActionListener) frame.getController());
        cancelBtn.addActionListener((ActionListener) frame.getController());
        setLayout(new GridLayout(4, 2));
        
        add(itemNameLbl);
        add(itemNameCol);
        add(itemCountLbl);
        add(itemCountCol);
        add(itemPriceLbl);
        add(itemPriceCol);
        add(okBtn);
        add(cancelBtn);
        
        pack();
    }

    public JTextField getItemNameField() {
        return itemNameCol;
    }

    public JTextField getItemCountField() {
        return itemCountCol;
    }

    public JTextField getItemPriceField() {
        return itemPriceCol;
    }
}
