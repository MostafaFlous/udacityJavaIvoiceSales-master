
package com.SIJ.model;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class LinesTableShow extends AbstractTableModel {

    private ArrayList<ItemLine> lines;
    private String[] columns = {"No.", "Item Name", "Item Price", "Count", "Item Total"};

    public LinesTableShow(ArrayList<ItemLine> lines) {
        this.lines = lines;
    }

    public ArrayList<ItemLine> getLines() {
        return lines;
    }
    
    
    @Override
    public int getRowCount() {
        return lines.size();
    }

    @Override
    public int getColumnCount() {
        return columns.length;
    }

    @Override
    public String getColumnName(int x) {
        return columns[x];
    }
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        ItemLine line = lines.get(rowIndex);
        
        switch(columnIndex) {
            case 0: return line.getInvoice().getInvoiceId();
            case 1: return line.getUnit();
            case 2: return line.getPriceOfUnit();
            case 3: return line.getUnitId();
            case 4: return line.getLineTotal();
            default : return "";
        }
    }
    
}
