
package com.SIJ.model;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class InvoicesTableShow extends AbstractTableModel {
    private final ArrayList<Invoice> invoices;
    private final String[] columns = {"No.", "Date", "Customer", "Total"};
    
    public InvoicesTableShow(ArrayList<Invoice> invoices) {
        this.invoices = invoices;
    }
    
    @Override
    public int getRowCount() {
        return invoices.size();
    }

    @Override
    public int getColumnCount() {
        return columns.length;
    }

    @Override
    public String getColumnName(int column) {
        return columns[column];
    }
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Invoice invoice = invoices.get(rowIndex);
        
        switch (columnIndex) {
            case 0: return invoice.getInvoiceId();
            case 1: return invoice.getInvoiceDate();
            case 2: return invoice.getCustomer();
            case 3: return invoice.getInvoiceTotal();
            default : return "";
        }
    }
}
