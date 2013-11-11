/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dto;

import java.io.Serializable;

/**
 *
 * @author Thomas
 */

public class DTOTransactionDetail implements Serializable {
    private static final long serialVersionUID = 4913212905L;


    public DTOTransactionDetail(int transactionNumber, double amount, String comment) {
        this.transactionNumber = transactionNumber;
        this.amount = amount;
        this.comment = comment;
    }

    private int transactionNumber;
    private double amount;
    private String comment;

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public int getTransactionNumber() {
        return transactionNumber;
    }

    public void setTransactionNumber(int transactionNumber) {
        this.transactionNumber = transactionNumber;
    }
    
    
}
