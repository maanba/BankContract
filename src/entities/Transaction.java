/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.util.Date;

/**
 *
 * @author THL
 */
public class Transaction {

    private Date date;
    private int transactionNumber;
    private Account fromAccount;
    private Account toAccount;
    private long amount;
    private long toAmount;
    private long fromAmount;
    private String comment;

    public Transaction() {
    }

    public Transaction(int transactionNumber, Account account, long amount, String comment) {
        this.date = new Date();
        this.transactionNumber = transactionNumber;
        if (amount > 0) {
            this.toAccount = account;
            this.toAmount = amount;
        } else {
            this.fromAccount = account;
            this.fromAmount = amount;
        }
        this.comment = comment;
    }
    
    public Transaction(int transactionNumber, long amount, String comment){
        this.transactionNumber = transactionNumber;
        this.amount = amount;
        this.comment = comment;
    }

    public Transaction(int transactionNumber, Account fromAccount, Account toAccount, long fromAmount, long toAmount, String comment) {
        this.date = new Date();
        this.transactionNumber = transactionNumber;
        this.fromAccount = fromAccount;
        this.toAccount = toAccount;
        this.fromAmount = fromAmount;
        this.toAmount = toAmount;
        this.comment = comment;
    }

    //<editor-fold defaultstate="collapsed" desc="Getters and setters">
    public long getAmount() {
        return amount;
    }

    public void setAmount(long amount) {
        this.amount = amount;
    }
    
    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Account getFromAccount() {
        return fromAccount;
    }

    public void setFromAccount(Account fromAccount) {
        this.fromAccount = fromAccount;
    }

    public Account getToAccount() {
        return toAccount;
    }

    public void setToAccount(Account toAccount) {
        this.toAccount = toAccount;
    }

    public long getToAmount() {
        return toAmount;
    }

    public void setToAmount(long toAmount) {
        this.toAmount = toAmount;
    }

    public long getFromAmount() {
        return fromAmount;
    }

    public void setFromAmount(long fromAmount) {
        this.fromAmount = fromAmount;
    }

    public int getTransactionNumber() {
        return transactionNumber;
    }

    public void setTransactionNumber(int transactionNumber) {
        this.transactionNumber = transactionNumber;
    }

    //</editor-fold>
    @Override
    public String toString() {
        return "date=" + date + ", transactionNumber=" + transactionNumber + ", fromAccount=" + fromAccount + ", toAccount=" + toAccount + ", toAmount=" + toAmount + ", fromAmount=" + fromAmount + ", comment=" + comment;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
