/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dto;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author DragønEye
 */
public class DTOAccount {

    protected String accountType;
    protected Map<Integer, DTOTransactionDetail> transactions = new HashMap<>();
    protected int accountnumber;
    protected double interest;
    protected long balance;
    protected Date created;

    public DTOAccount(String accountType, int accountnumber, double interest, long balance, Date created) {
        this.accountType = accountType;
        this.accountnumber = accountnumber;
        this.interest = interest;
        this.balance = balance;
        this.created = created;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public Map<Integer, DTOTransactionDetail> getTransactions() {
        return transactions;
    }

    public void setTransactions(Map<Integer, DTOTransactionDetail> transactions) {
        this.transactions = transactions;
    }

    public int getAccountnumber() {
        return accountnumber;
    }

    public void setAccountnumber(int accountnumber) {
        this.accountnumber = accountnumber;
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

    public void setBalance(long balance) {
        this.balance = balance;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }
}