/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dto;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author DragønEye
 */
public class DTOTransaction implements Serializable {
    private static final long serialVersionUID = 753210310347L;
    private Date date;
    private int transactionNumber;
    private DTOAccount fromAccount;
    private DTOAccount toAccount;
    private long amount;
    private String comment;

    public DTOTransaction(Date date, int transactionNumber, DTOAccount fromAccount, DTOAccount toAccount, long amount, String comment) {
        this.date = date;
        this.transactionNumber = transactionNumber;
        this.fromAccount = fromAccount;
        this.toAccount = toAccount;
        this.amount = amount;
        this.comment = comment;
    }
    
    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getTransactionNumber() {
        return transactionNumber;
    }

    public void setTransactionNumber(int transactionNumber) {
        this.transactionNumber = transactionNumber;
    }

    public DTOAccount getFromAccount() {
        return fromAccount;
    }

    public void setFromAccount(DTOAccount fromAccount) {
        this.fromAccount = fromAccount;
    }

    public DTOAccount getToAccount() {
        return toAccount;
    }

    public void setToAccount(DTOAccount toAccount) {
        this.toAccount = toAccount;
    }

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
}
