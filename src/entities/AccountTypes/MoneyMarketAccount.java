/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package entities.AccountTypes;

import entities.Account;
import entities.Transaction;
import java.util.Date;
import java.util.HashMap;

/**
 * Pt. kan kontoen ikke gå under minimumsbalancen. 
 * Man kan lave det således at der kan gives en bøde såfremt man når under. 
 * Bliver måske implementeret. 
 * @author Mads
 */
public class MoneyMarketAccount extends Account {

    private double minimumBalance;

    public MoneyMarketAccount(int accountNumber) {
        minimumBalance = 0.0;
        super.accountType = "Money Market Account";
        super.accountnumber = accountNumber;
        super.created = new Date();
        super.transactions = new HashMap<>();
    }

    public double getMinimumBalance() {
        return minimumBalance;
    }

    public void setMinimumBalance(double minimumBalance) {
        this.minimumBalance = minimumBalance;
    }

    @Override
    public void addDepositTransaction(Transaction t) {
        if ((super.balance + t.getToAmount()) < minimumBalance) {
            throw new IllegalStateException("Exceeding minimum balance! Transaction not completed!");
        } else {
            super.addDepositTransaction(t);
        }
    }
}
