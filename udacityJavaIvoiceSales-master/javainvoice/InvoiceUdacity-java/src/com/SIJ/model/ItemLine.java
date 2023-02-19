
package com.SIJ.model;

public class ItemLine {
    private String unit;
    private double priceOfUnit;
    private int unitId;
    private Invoice invoice;

    public ItemLine() {
    }

    public ItemLine(String unit, double priceOfUnit, int unitId, Invoice invoice) {
        this.unit = unit;
        this.priceOfUnit = priceOfUnit;
        this.unitId = unitId;
        this.invoice = invoice;
    }

    public double getLineTotal() {
        return priceOfUnit * unitId;
    }
    
    public int getUnitId() {
        return unitId;
    }

    public void setUnitId(int unitId) {
        this.unitId = unitId;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String item) {
        this.unit = item;
    }

    public double getPriceOfUnit() {
        return priceOfUnit;
    }

    public void setPriceOfUnit(double priceOfUnit) {
        this.priceOfUnit = priceOfUnit;
    }

    @Override
    public String toString() {
        return "Line{" + "num=" + invoice.getInvoiceId() + ", item=" + unit + ", price=" + priceOfUnit + ", count=" + unitId + '}';
    }

    public Invoice getInvoice() {
        return invoice;
    }
    
    public String getAsCSV() {
        return invoice.getInvoiceId() + "," + unit + "," + priceOfUnit + "," + unitId;
    }
    
}
