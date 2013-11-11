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

    public DTOTransactionDetail(int transactionNumber, long amount, String comment) {
        this.transactionNumber = transactionNumber;
        this.amount = amount;
        this.comment = comment;
    }

    private int transactionNumber;
    private long amount;
    private String comment;

    public long getAmount() {
        return amount;
    }

    public void setAmount(long amount) {
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
