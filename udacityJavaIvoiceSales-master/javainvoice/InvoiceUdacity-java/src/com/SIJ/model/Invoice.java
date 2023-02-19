package com.SIJ.model;

import java.util.ArrayList;

public class Invoice {
    private int invoiceId;
    private String invoiceDate;
    private String customer;
    private ArrayList<ItemLine> lines;
    
    public Invoice() {
    }

    public Invoice(int invoiceId, String invoiceDate, String customer) {
        this.invoiceId = invoiceId;
        this.invoiceDate = invoiceDate;
        this.customer = customer;
    }

    public double getInvoiceTotal() {
        double total = 0.0;
        for (ItemLine line : getLines()) {
            total += line.getLineTotal();
        }
        return total;
    }
    
    public ArrayList<ItemLine> getLines() {
        if (lines == null) {
            lines = new ArrayList<>();
        }
        return lines;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public int getInvoiceId() {
        return invoiceId;
    }

    public void setinvoiceId(int invoiceId) {
        this.invoiceId = invoiceId;
    }

    public String getInvoiceDate() {
        return invoiceDate;
    }

    public void setInvoiceDate(String invoiceDate) {
        this.invoiceDate = invoiceDate;
    }

    @Override
    public String toString() {
        return "Invoice{" + "invoiceId" + invoiceId + ", date=" + invoiceDate + ", customer=" + customer + '}';
    }
    
    public String getAsCSV() {
        return invoiceId + "," + invoiceDate + "," + customer;
    }
    
}
