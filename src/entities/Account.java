/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author THL
 */
public abstract class Account {

    protected String accountType;
    protected Map<Integer, Transaction> transactions = new HashMap<>();
    protected int accountnumber;
    protected double interest;
    protected long balance;
    protected Date created;

//<editor-fold defaultstate="collapsed" desc="Getters and setters">
    public Transaction getTransaction(int i) {
        return transactions.get(i);
    }

    public ArrayList<Transaction> getTransactions() {
        return new ArrayList<>(transactions.values());
    }

    public void addDepositTransaction(Transaction t) {
        balance += t.getToAmount();
        transactions.put(t.getTransactionNumber(), t);
    }

    public void addWithdrawTransaction(Transaction t) {
        balance += t.getFromAmount();
        transactions.put(t.getTransactionNumber(), t);
    }

    public int getAccountnumber() {
        return accountnumber;
    }

    public double getInterest() {
        return interest;
    }

    public void setInterest(double interest) {
        this.interest = interest;
    }

    public long getBalance() {
        return balance;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }
    //</editor-fold>
}
